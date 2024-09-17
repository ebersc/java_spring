package br.dev.eberson.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.eberson.drogaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Byte>{

}
