package com.arturlogan.projeto_mod32.repositories;

import com.arturlogan.projeto_mod32.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
