package com.arturlogan.projeto_mod32.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_id")
    @SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME", length = 10, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_carro_marca"), referencedColumnName = "id", nullable = false)
    private Marca marca;

    @ManyToMany
    @JoinTable(
            name = "TB_CARRO_ACESSORIO",
            joinColumns = @JoinColumn(name = "carro_id"),
            inverseJoinColumns = @JoinColumn(name = "acessorio_id")
    )
    private List<Acessorio> acessorio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Acessorio> getAcessorioList() {
        return acessorio;
    }

    public void setAcessorioList(List<Acessorio> acessori0) {
        this.acessorio = acessorio;
    }
}
