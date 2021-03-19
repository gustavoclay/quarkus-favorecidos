package org.acme.favorecido.resources;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class FavorecidoResourceTest {

    @Test
    public void getFavorecidosSucessoTest() {
        given()
            .when()
                .get("/favorecidos/50373584342")
            .then()
                .statusCode(200)
                .body("size()", is(5));
    }

    @Test
    public void getFavorecidosListaVaziaTest() {
        given()
            .when()
            .get("/favorecidos/0")
            .then()
                .statusCode(200)
                .body("size()", is(0));
    }

}