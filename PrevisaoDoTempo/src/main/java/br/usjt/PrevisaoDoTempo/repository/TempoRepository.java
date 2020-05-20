package br.usjt.PrevisaoDoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisaoDoTempo.model.Previsao;

public interface TempoRepository extends JpaRepository<Previsao, Long>{
	

}
