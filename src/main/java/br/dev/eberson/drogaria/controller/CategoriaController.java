package br.dev.eberson.drogaria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.dev.eberson.drogaria.domain.Categoria;
import br.dev.eberson.drogaria.exception.RecursoNaoEncontradoException;
import br.dev.eberson.drogaria.repository.CategoriaRepository;
import br.dev.eberson.drogaria.service.CategoriaService;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	
//	@GetMapping
//	public List<Categoria> listar(){
//		List<Categoria> categorias = categoriaRepository.findAll();
//		return categorias;
//	}
	
	@GetMapping("/{codigo}")
	public Categoria buscarPorCodigo(@PathVariable Byte codigo) {
		try {
			return categoriaService.buscarPorCodigo(codigo);
		} catch (RecursoNaoEncontradoException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada", ex);
		}
	}
	
//	@PostMapping
//	public Categoria inserir(@RequestBody Categoria categoria) {
//		return categoriaRepository.save(categoria);
//	}
	
//	@DeleteMapping("/{codigo}")
//	public Categoria excluir(@PathVariable Byte codigo) {
//		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
//		categoriaRepository.delete(categoria.get());
//		return categoria.get();
//	}
	
//	@PutMapping
//	public Categoria editar(@RequestBody Categoria categoria) {
//		return categoriaRepository.save(categoria);
//	}
}
