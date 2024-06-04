package com.arturlogan.projeto_mod32.services.interfaces;

import com.arturlogan.projeto_mod32.entities.Carro;

import java.util.List;

public interface ICarroService {

    public Carro cadastrar(Carro carro);

    public void excluir(Long id);

    public List<Carro> listarTodos();


}
