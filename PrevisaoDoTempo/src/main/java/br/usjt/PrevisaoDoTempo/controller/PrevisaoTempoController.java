package br.usjt.PrevisaoDoTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.PrevisaoDoTempo.model.Previsao;
import br.usjt.PrevisaoDoTempo.service.PrevisaoService;

@Controller
public class PrevisaoTempoController {
	@Autowired
	private PrevisaoService previsaoService;
	
	@GetMapping("/previsaotempo")
	public ModelAndView listarPrevisaoTempo() {
		ModelAndView mv = new ModelAndView("lista_Previsao_Tempo");
		mv.addObject(new Previsao());
		List<Previsao> previsaoTempo = previsaoService.listarPrevisaoTempo();
		mv.addObject("previsaoTempo", previsaoTempo);
		return mv;
	}
	@PostMapping("/previsaotempo")
	public String salvar(Previsao previsao) {
		previsaoService.salvar(previsao);
		return "redirect:/previsaotempo";
	}
}
