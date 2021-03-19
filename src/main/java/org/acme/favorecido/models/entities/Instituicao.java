package org.acme.favorecido.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "INSTITUICAO")
public class Instituicao extends PanacheEntity {

    @Column(name = "nome")
    public String nome;

    public Instituicao() {
    }

    public Instituicao(String nome) {
        this.nome = nome;
    }

}
