package org.acme.favorecido.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "CONTA")
public class Conta extends PanacheEntity {

    @Column(name = "agencia")
    public String agencia;

    @Column(name = "num_conta")
    public String numeroConta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    public Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "instituicao_id")
    public Instituicao instituicao;

    public Conta() {
    }

    public Conta(String agencia, String numeroConta, Cliente cliente, Instituicao instituicao) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.instituicao = instituicao;
    }

}
