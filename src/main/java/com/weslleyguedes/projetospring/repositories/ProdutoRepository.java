package com.weslleyguedes.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyguedes.projetospring.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
