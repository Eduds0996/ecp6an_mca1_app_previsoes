package br.usjt.rest_json_cidades.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import br.usjt.rest_json_cidades.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	List<Cidade> findByNomeStartingWith(String nome);
	
	Cidade findByLatitudeAndLongitude(double latitude , double longitude);
}


