package br.com.impacta.quizapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.impacta.quizapi.model.Pergunta;
import br.com.impacta.quizapi.repository.PerguntaRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/pergunta")
public class PerguntaController {
	
	@Autowired
	PerguntaRepository repository;
	
	@GetMapping("")
	public List<Pergunta> findAll(){
		return repository.findAll();
	}
	
	@PostMapping("")
	public Pergunta create(@RequestBody Pergunta entrada) {
		return repository.save(entrada);
	}
	
	@GetMapping("/{id}")
	public <Pergunta>Optional getOne (@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Pergunta update(@RequestBody Pergunta entrada, @PathVariable int id) {
		entrada.setId(id);
		return repository.save(entrada);
	}
}
