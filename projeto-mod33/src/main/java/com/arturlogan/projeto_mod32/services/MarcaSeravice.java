package com.arturlogan.projeto_mod32.services;

import com.arturlogan.projeto_mod32.entities.Marca;
import com.arturlogan.projeto_mod32.repositories.CarroRepository;
import com.arturlogan.projeto_mod32.repositories.MarcaRepository;
import com.arturlogan.projeto_mod32.services.interfaces.IMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaSeravice implements IMarcaService {

    private final MarcaRepository marcaRepository;

    @Autowired
    public MarcaSeravice(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public Marca cadastrar(Marca marca) {
        Marca marca1 = marcaRepository.save(marca);

        return marca1;
    }

    @Override
    public void excluir(Long id) {

    }

    @Override
    public List<Marca> listarTodos() {
        return List.of();
    }
}
