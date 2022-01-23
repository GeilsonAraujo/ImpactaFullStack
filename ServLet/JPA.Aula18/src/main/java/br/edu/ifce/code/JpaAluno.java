package br.edu.ifce.code;

import java.io.IOException;

import javax.persistence.EntityManager;
import br.edu.ifce.model.Aluno;
import br.edu.ifce.model.Endereco;
import br.edu.ifce.model.Telefone;
import br.edu.ifce.utils.JPAUtil;

public class JpaAluno {
	
	public static void main(String[] args) throws IOException{
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		manager.getTransaction().begin();
		
		Aluno a = new Aluno();		
		a.setCPF("063.671.853-05");
		a.setNome("Nome de Que");
		a.setRG("numero de rg");
		
		Endereco e = new Endereco();
		e.setBairro("Paupina");
		e.setCep("60762495");
		e.setCidade("Maracanau");
		e.setLogradouro("Rua Astrologilda");
		manager.persist(e);
		
		a.setEndereco(e);
		
		Telefone t1 = new Telefone();
		Telefone t2 = new Telefone();
		
		t1.setTelefone("40028922");
		t1.setTipo("comercial");
		
		t1.setTelefone("34722418");
		t1.setTipo("fixo");
		
		a.getTelefone().add(t1);
		a.getTelefone().add(t2);
		
		
		manager.persist(t1);
		manager.persist(t2);
		manager.persist(e);
		manager.persist(a);
		
		manager.getTransaction().commit();
		manager.close();

	}

}
