package br.usjt.PrevisaoDoTempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.PrevisaoDoTempo.repository.TempoRepository;
import br.usjt.PrevisaoDoTempo.model.Previsao;

@Service
public class PrevisaoService {
	@Autowired
	private TempoRepository previsaoRepo;
	
	public List<Previsao> listarPrevisaoTempo() {
		return previsaoRepo.findAll();
	}
	
	public void salvar(Previsao previsao) {
		previsaoRepo.save(previsao);
	}
}
