package com.projeto.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.cliente.model.Cliente;
import com.projeto.cliente.model.Email;
import com.projeto.cliente.model.Telefone;
import com.projeto.cliente.repository.ClienteRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> findAll(){  
		return clienteRepository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Cliente findOne(@PathVariable Long id) {
		return clienteRepository.findClienteById(id);
	}
	
	@PostMapping
	public Cliente save(@RequestBody Cliente cliente) {
		cliente.setCpf(cliente.getCpf().replaceAll("[^0-9]", ""));
		cliente.setCep(cliente.getCep().replaceAll("[^0-9]", ""));
		for (Telefone telefone : cliente.getContatos()) {
			telefone.setTelefone(telefone.getTelefone().replaceAll("[^0-9]", ""));
			telefone.setCliente(cliente);
		}
		for (Email email : cliente.getEmails()) {
			email.setCliente(cliente);
		}
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable Long id) {
		clienteRepository.deleteById(id);
	}
	
	

}
