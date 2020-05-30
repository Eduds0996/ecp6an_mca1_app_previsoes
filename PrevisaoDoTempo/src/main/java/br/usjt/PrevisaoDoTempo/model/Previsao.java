package br.usjt.PrevisaoDoTempo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	@Column (nullable=false, length=100)
	private double temperaturamax;
	@Column (nullable=false, length=100)
	private double temperaturamin;
	@Column (nullable=false, length=100)
	private double humidaderelativa;
	@Column (nullable=false, length=100)
	private String descricao;
	@Column (nullable=false, length=100)
	private String datahora;
	@Column (nullable=false, length=100)
	private double latitude;
	@Column (nullable=false, length=100)
	private double longitude;
	@OneToOne(optional= false)
	@JoinColumn(name="diadasemana")
	private DiaDaSemana diadasemana;
}
