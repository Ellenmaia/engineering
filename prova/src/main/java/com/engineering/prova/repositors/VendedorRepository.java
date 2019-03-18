package com.engineering.prova.repositors;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engineering.prova.entity.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer>{
	
}
