package br.dev.eberson.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id; //cod do produto
	
	@Column(length = 120, nullable = false, unique = true)
	private String nome; //descricao produto
	
	@Column(nullable = false)
	private Short quantidade; //quantidade do produto
	
	@Column(nullable = false, precision = 5, scale = 2)
	private BigDecimal preco; //preco do produto
	
	@Column
	private LocalDate data_validade; //data de validade do produto
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Categoria categoria;
}
