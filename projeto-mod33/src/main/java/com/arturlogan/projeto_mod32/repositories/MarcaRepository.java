package com.arturlogan.projeto_mod32.repositories;

import com.arturlogan.projeto_mod32.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
