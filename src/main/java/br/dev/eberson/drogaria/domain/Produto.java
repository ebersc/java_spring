package br.dev.eberson.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
	private Short id; //cod do produto
	
	private String nome; //descricao produto
	
	private Short quantidade; //quantidade do produto
	
	private BigDecimal preco; //preco do produto
	
	private LocalDate data_validade; //data de validade do produto
}
