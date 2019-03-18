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

import com.engineering.prova.entity.Vendedor;
import com.engineering.prova.repositors.VendedorRepository;

@RestController
public class VendedorController {
	private VendedorRepository vendedorRepository;

	VendedorController (VendedorRepository vendedorRepository){
		this.vendedorRepository = vendedorRepository;
	}
	
	@Transactional
	@RequestMapping(value={"/vendedor"}, method={RequestMethod.POST} )
	public Vendedor inserir(@RequestBody Vendedor vendedor) {
		return vendedorRepository.save(vendedor);
	}
	
	@RequestMapping(value={"/vendedor/{id}"}, method={RequestMethod.PUT})
	public Vendedor update(@PathVariable("id") Integer id, @RequestBody Vendedor vendedor) {
		return vendedorRepository.save(vendedor);
	}
	
	@RequestMapping(value={"/vendedor"}, method={RequestMethod.GET})
	public List<Vendedor> buscar() {
		return vendedorRepository.findAll();
	}
	
	@RequestMapping(value={"/vendedor/{id}"}, method={RequestMethod.GET})
	public ResponseEntity<Vendedor> form3(@PathVariable("id") Integer id) {
		Optional<Vendedor> findById = vendedorRepository.findById(id);
		
		if (findById.isPresent())
			return ResponseEntity.ok(findById.get());
		else
			return ResponseEntity.notFound().build();	
	}
	
	@RequestMapping(value={"/vendedor/{id}"}, method={RequestMethod.DELETE})
	public void delete(@PathVariable("id") Integer id) {
		vendedorRepository.deleteById(id);
	}
}
