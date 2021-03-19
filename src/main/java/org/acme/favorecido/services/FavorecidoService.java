package org.acme.favorecido.services;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.acme.favorecido.models.entities.Cliente;
import org.acme.favorecido.models.entities.Conta;
import org.acme.favorecido.models.entities.Favorecido;
import org.acme.favorecido.models.entities.Instituicao;

@ApplicationScoped
public class FavorecidoService {

    private List<Favorecido> getCargaLegado(String cpf) {
        // DADOS MOCADOS EXEMPLO CARGA LEGADO
        if (cpf.equals("50373584342")) {
            var insituicao = new Instituicao("BANCO GEN2");
            var cliente = new Cliente("50373584342", "JOAO DA SILVA");
            var clienteFavorecido = new Cliente("52258570277", "PELE DOS SANTOS");
            var conta = new Conta("1023", "300123", clienteFavorecido, insituicao);
            return Arrays.asList(new Favorecido(cliente, conta, true));
        }
        return Arrays.asList();
    }

    public List<Favorecido> getFavorecidos(String cpf) {
        var favorecidosLegado = getCargaLegado(cpf);
        List<Favorecido> favorecidos = Favorecido.find("cliente.cpf", cpf).list();
        favorecidos.addAll(favorecidosLegado);
        return favorecidos;
    }

}
