package org.acme.favorecido.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "CLIENTE")
public class Cliente extends PanacheEntity {

    @Column(name = "cpf")
    public String cpf;

    @Column(name = "nome")
    public String nome;

    public Cliente() {
    }

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

}
