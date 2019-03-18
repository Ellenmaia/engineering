package com.engineering.prova.repositors;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engineering.prova.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
