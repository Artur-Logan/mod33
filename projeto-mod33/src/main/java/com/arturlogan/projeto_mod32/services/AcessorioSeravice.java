package com.arturlogan.projeto_mod32.services;

import com.arturlogan.projeto_mod32.entities.Acessorio;
import com.arturlogan.projeto_mod32.entities.Marca;
import com.arturlogan.projeto_mod32.repositories.AcessorioRepository;
import com.arturlogan.projeto_mod32.repositories.MarcaRepository;
import com.arturlogan.projeto_mod32.services.interfaces.IAcessorioService;
import com.arturlogan.projeto_mod32.services.interfaces.IMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcessorioSeravice implements IAcessorioService {

    private final AcessorioRepository acessorioRepository;

    @Autowired
    public AcessorioSeravice(AcessorioRepository acessorioRepository) {
        this.acessorioRepository= acessorioRepository;
    }

    @Override
    public Acessorio cadastrar(Acessorio acessorio) {
        Acessorio acessorio1 = acessorioRepository.save(acessorio);

        return acessorio1;
    }

    @Override
    public void excluir(Long id) {

    }

    @Override
    public List<Acessorio> listarTodos() {
        return List.of();
    }
}
