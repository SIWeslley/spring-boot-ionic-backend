package com.weslleyguedes.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslleyguedes.projetospring.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
