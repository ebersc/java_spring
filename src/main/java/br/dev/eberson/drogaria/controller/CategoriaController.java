package br.dev.eberson.drogaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping
	public Categoria inserir(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	@DeleteMapping("/{codigo}")
	public Categoria excluir(@PathVariable Byte codigo) {
		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
		categoriaRepository.delete(categoria.get());
		return categoria.get();
	}
	
	@PutMapping
	public Categoria editar(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}
