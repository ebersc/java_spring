package br.dev.eberson.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.eberson.drogaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short>{

}
