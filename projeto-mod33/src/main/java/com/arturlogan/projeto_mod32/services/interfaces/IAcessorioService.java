package com.arturlogan.projeto_mod32.services.interfaces;

import com.arturlogan.projeto_mod32.entities.Acessorio;

import java.util.List;

public interface IAcessorioService {

    public Acessorio cadastrar(Acessorio acessorio);

    public void excluir(Long id);

    public List<Acessorio> listarTodos();


}
