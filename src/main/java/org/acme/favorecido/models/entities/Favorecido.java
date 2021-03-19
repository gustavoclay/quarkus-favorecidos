package org.acme.favorecido.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "FAVORECIDO")
public class Favorecido extends PanacheEntity {

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    public Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "conta_id")
    public Conta contaFavorecido;

    @Column(name = "ativo")
    public Boolean ativo;

    public Favorecido() {
    }

    public Favorecido(Cliente cliente, Conta contaFavorecido, Boolean ativo) {
        this.cliente = cliente;
        this.contaFavorecido = contaFavorecido;
        this.ativo = ativo;
    }

}
