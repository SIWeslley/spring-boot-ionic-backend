package com.weslleyguedes.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyguedes.projetospring.domain.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
