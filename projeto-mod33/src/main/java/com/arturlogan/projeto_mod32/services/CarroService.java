package com.arturlogan.projeto_mod32.services;

import com.arturlogan.projeto_mod32.entities.Carro;
import com.arturlogan.projeto_mod32.repositories.CarroRepository;
import com.arturlogan.projeto_mod32.services.interfaces.ICarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService implements ICarroService {

    private final CarroRepository carroRepository;

    @Autowired
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    @Override
    public Carro cadastrar(Carro carro) {
        Carro carroCadastrado = carroRepository.save(carro);

        return carroCadastrado;
    }

    @Override
    public void excluir(Long id) {

    }

    @Override
    public List<Carro> listarTodos() {
        return List.of();
    }
}
