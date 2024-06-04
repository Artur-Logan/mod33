package com.arturlogan.projeto_mod32.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Acessorio {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="acessorio_seq")
    @SequenceGenerator(name="acessorio_seq", sequenceName="sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME", length = 30, nullable = false)
    private String nome;

    @Column(name = "DESCRICAO", length = 50, nullable = false)
    private String descricao;

    @ManyToMany(mappedBy = "acessorio")
    private List<Carro> carroList;

    public void setCarroList(List<Carro> carroList) {
        this.carroList = carroList;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public List<Carro> getCarroList() {
        return carroList;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
