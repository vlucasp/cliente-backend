package com.projeto.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.cliente.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {

}
