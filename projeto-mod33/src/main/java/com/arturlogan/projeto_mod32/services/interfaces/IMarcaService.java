package com.arturlogan.projeto_mod32.services.interfaces;

import com.arturlogan.projeto_mod32.entities.Marca;

import java.util.List;

public interface IMarcaService {

    public Marca cadastrar(Marca marca);

    public void excluir(Long id);

    public List<Marca> listarTodos();


}
