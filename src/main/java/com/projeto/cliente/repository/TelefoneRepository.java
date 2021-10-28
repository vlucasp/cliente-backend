package com.projeto.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.cliente.model.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
