package org.acme.favorecido.services;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class FavorecidoServiceTest {

    @Inject
    FavorecidoService service;

    @Test
    public void getFavorecidosSucessoTest() {
        Assertions.assertEquals(5, service.getFavorecidos("50373584342").size());
    }

    @Test
    public void getFavorecidosListaVaziaTest() {
        Assertions.assertEquals(0, service.getFavorecidos("0").size());
    }

}
