package com.weslleyguedes.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyguedes.projetospring.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
