package br.usjt.PrevisaoDoTempo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "diadasemana")
@Data @AllArgsConstructor @NoArgsConstructor
public class DiaDaSemana {
	@Id
	@GeneratedValue
	private Long id;
	private String diadasemana;	
}
