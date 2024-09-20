package br.dev.eberson.drogaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.eberson.drogaria.domain.Categoria;
import br.dev.eberson.drogaria.exception.RecursoNaoEncontradoException;
import br.dev.eberson.drogaria.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscarPorCodigo(Byte codigo) {
		Optional<Categoria> resultado = categoriaRepository.findById(codigo);
		
		if(resultado.isEmpty()) {
			throw new RecursoNaoEncontradoException();
		}
		Categoria categoria = resultado.get();
		return categoria;
	}
	
	public List<Categoria> buscarTodos() {
		List<Categoria> resultado = categoriaRepository.findAll();
		
		return resultado;
	}
	
	public Categoria inserir(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public Categoria excluir(Byte codigo) {
		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
		
		if(categoria.isEmpty()) {
			throw new RecursoNaoEncontradoException();
		}
		
		categoriaRepository.delete(categoria.get());
		return categoria.get();
	}
	
	public Categoria editar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}
