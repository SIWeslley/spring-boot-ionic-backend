package com.weslleyguedes.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyguedes.projetospring.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
