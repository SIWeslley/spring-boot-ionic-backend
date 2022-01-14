package com.weslleyguedes.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyguedes.projetospring.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
