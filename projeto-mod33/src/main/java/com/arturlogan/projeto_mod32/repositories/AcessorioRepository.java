package com.arturlogan.projeto_mod32.repositories;

import com.arturlogan.projeto_mod32.entities.Acessorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessorioRepository extends JpaRepository<Acessorio, Long> {
}
