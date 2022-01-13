package com.weslleyguedes.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyguedes.projetospring.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}