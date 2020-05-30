package br.usjt.PrevisaoDoTempo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "previsao")
@Data @AllArgsConstructor @NoArgsConstructor
public class Previsao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
//	private String diadasemana;	
	private double temperaturamax;	
	private double temperaturamin;	
	private double humidaderelativa;	
	private String descricao;	
	private String datahora;	
//	private double latitude;	
//	private double longitude;
	
	@OneToOne(optional= false)
	@JoinColumn(name="diadasemana")	
	private DiaDaSemana diadasemana;
	
	@ManyToOne (cascade = CascadeType.ALL)
	private Cidade cidade;
}
