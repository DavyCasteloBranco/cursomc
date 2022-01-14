package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Pagamento;

//Camada de acesso a dados (Repository)
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
	
	
	
}
