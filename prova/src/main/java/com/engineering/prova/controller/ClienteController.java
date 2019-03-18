package com.engineering.prova.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.engineering.prova.entity.Cliente;
import com.engineering.prova.repositors.ClienteRepository;
import com.engineering.prova.repositors.VendedorRepository;

@RestController
public class ClienteController {
	private ClienteRepository clienteRepository;
	private VendedorRepository vendedorRepository;
	
	ClienteController (ClienteRepository clienteRepository, VendedorRepository vendedorRepository){
		this.clienteRepository = clienteRepository;
		this.vendedorRepository = vendedorRepository;
	}
	
	@Transactional
	@RequestMapping(value={"/cliente"}, method={RequestMethod.POST} )
	public Cliente inserir(@RequestBody Cliente cliente) {
		vendedorRepository.save(cliente.getVendedor());
		return clienteRepository.save(cliente);
	}
	
	@RequestMapping(value={"/cliente/{id}"}, method={RequestMethod.PUT})
	public Cliente update(@PathVariable("id") Integer id, @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@RequestMapping(value={"/cliente"}, method={RequestMethod.GET})
	public List<Cliente> buscar() {
		return clienteRepository.findAll();
	}
	
	@RequestMapping(value={"/cliente/{id}"}, method={RequestMethod.GET})
	public ResponseEntity<Cliente> form3(@PathVariable("id") Integer id) {
		Optional<Cliente> findById = clienteRepository.findById(id);
		
		if (findById.isPresent())
			return ResponseEntity.ok(findById.get());
		else
			return ResponseEntity.notFound().build();	
	}
	
	@RequestMapping(value={"/cliente/{id}"}, method={RequestMethod.DELETE})
	public void delete(@PathVariable("id") Integer id) {
		clienteRepository.deleteById(id);
	}
}
