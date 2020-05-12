package br.usjt.PrevisaoDoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.PrevisaoDoTempo.model.PrevisaoDoTempo;
import br.usjt.PrevisaoDoTempo.repository.TempoRepository;

@Controller
public class PrevisaoTempoController {
	
	@Autowired
	private TempoRepository previsaoRepo;
	
	@GetMapping("/previsaotempo")
	public ModelAndView listarPrevisaoTempo() {
		ModelAndView mv = new ModelAndView("lista_Previsao_Tempo");
		List<PrevisaoDoTempo> previsaoTempo = previsaoRepo.findAll();
		mv.addObject("previsaoTempo", previsaoTempo);
		return mv;
	}
	
}
