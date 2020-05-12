package br.usjt.PrevisaoDoTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisaoDoTempo.model.PrevisaoDoTempo;

public interface TempoRepository extends JpaRepository<PrevisaoDoTempo, Long>{
	

}
