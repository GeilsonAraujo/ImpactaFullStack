package br.com.impacta.quizapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.impacta.quizapi.model.Pessoa;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	//Responsavel por fazer o rotemanto de rota
	@GetMapping("/a")
	public Pessoa getA(){
		Pessoa p1 = new Pessoa();
		p1.setIdade(12);
		p1.setNome("Alberto");
		
		return p1;
	}
	
}
