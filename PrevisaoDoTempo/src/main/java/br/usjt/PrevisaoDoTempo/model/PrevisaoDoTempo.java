package br.usjt.PrevisaoDoTempo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name="previsao")
public class PrevisaoDoTempo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String diadasemana;
	private double temperaturamax;
	private double temperaturamin;
	private double umidaderelativa;
	private String descricao;
	
}
