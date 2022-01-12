package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Estado;

//Camada de acesso a dados (Repository)
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
	
	
}
