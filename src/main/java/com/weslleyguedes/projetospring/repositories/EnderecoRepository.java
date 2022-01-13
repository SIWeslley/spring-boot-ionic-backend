package com.weslleyguedes.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyguedes.projetospring.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
