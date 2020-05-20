package br.usjt.PrevisaoDoTempo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.PrevisaoDoTempo.model.Usuario;
import br.usjt.PrevisaoDoTempo.service.UsuarioService;

@Controller
public class LoginController {
	@Autowired
	private UsuarioService usuarioService;
	@GetMapping(value = {"/login" , "/"})
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject(new Usuario());
		return mv;
	}
	@PostMapping("/fazerLogin")
	public String fazerLogin(HttpServletRequest request ,Usuario usuario) {
		if(usuarioService.logar(usuario)) {
			request.getSession().setAttribute("usuarioLogado", usuario);
			return "redirect:previsaotempo";
		}
		else {
			return "login";
		}
	}
}
