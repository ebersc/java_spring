package br.dev.eberson.drogaria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.dev.eberson.drogaria.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Test
	public void inserir() {
		Produto p1 = new Produto(
				null,
				"Coca Cola",
				Short.valueOf("15"),
				BigDecimal.valueOf(10.50),
				LocalDate.of(2025, 10, 22),
				null
		);
		
		Produto p2 = new Produto(
				null,
				"Sprite",
				Short.valueOf("23"),
				BigDecimal.valueOf(8.00),
				LocalDate.of(2025, 10, 22),
				null
		);
		
		produtoRepository.save(p1);
		produtoRepository.save(p2);
	}
}
