package br.usjt.PrevisaoDoTempo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.PrevisaoDoTempo.model.Usuario;
import br.usjt.PrevisaoDoTempo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin() , usuario.getSenha()) != null;
	}
}
