package br.usjt.rest_json_cidades.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.usjt.rest_json_cidades.model.Cidade;
import br.usjt.rest_json_cidades.repository.CidadeRepository;

@RestController
@RequestMapping ("/cidades")
public class CidadeResource {
	@Autowired
	CidadeRepository cidadeRepo;

	@GetMapping ("/todas")
	public List <Cidade> todosAsCidades(){
		return cidadeRepo.findAll();
	}

	@PostMapping ("/salvarCidade")
	public ResponseEntity<Cidade> salvar ( @RequestBody Cidade cidade, HttpServletResponse
			response) {
		Cidade l = cidadeRepo.save(cidade);
		URI uri = ServletUriComponentsBuilder.

				fromCurrentServletMapping().path("/{id}").
				buildAndExpand(l.getId()).
				toUri();
		return ResponseEntity.created(uri).body(l);
	}
	
	@GetMapping("/{latitude}"+ "/{longitude}")
	public Cidade buscarPelaLatitudeLongitude(@PathVariable(value="latitude") double latitude ,@PathVariable(value="longitude") double longitude) {
		return cidadeRepo.findByLatitudeAndLongitude(latitude, longitude);
	}
	
	@GetMapping("/{nome}")
	public List<Cidade> buscarPelaLetraInicial(@PathVariable(value="nome") String nome) {
		return cidadeRepo.findByNomeStartingWith(nome);
	}
	
	
}