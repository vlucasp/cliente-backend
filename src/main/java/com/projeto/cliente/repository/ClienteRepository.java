package com.projeto.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.cliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	Cliente findClienteById(long id);
	
}
