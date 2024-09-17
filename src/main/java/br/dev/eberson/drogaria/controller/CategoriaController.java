package br.dev.eberson.drogaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.eberson.drogaria.domain.Categoria;
import br.dev.eberson.drogaria.repository.CategoriaRepository;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listar(){
		List<Categoria> categorias = categoriaRepository.findAll();
		return categorias;
	}
}
