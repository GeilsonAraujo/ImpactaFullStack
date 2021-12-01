package br.com.impacta.quizapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.impacta.quizapi.model.Pergunta;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RepositoryRestResource(collectionResourceRel = "pergunta", path = "pergunta")
public interface PerguntaRepository extends JpaRepository<Pergunta, Integer> {

}
