package br.edu.ifce.code;

import javax.persistence.EntityManager;
import br.edu.ifce.model.Aluno;
import br.edu.ifce.model.Endereco;
import br.edu.ifce.utils.JPAUtil;

public class JpaAluno {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		manager.getTransaction().begin();
		
		Aluno a = new Aluno();		
		a.setCPF("06367185305");
		a.setNome("Volverine Adamantium");
		a.setRG("numero de rg");
		
		Endereco e = new Endereco();
		e.setBairro("Paupina");
		e.setCep("60762495");
		e.setCidade("Maracanau");
		e.setLogradouro("Rua Astrologilda");
		manager.persist(e);
		
		a.setEndereco(e);
		
		manager.persist(a);
		
		manager.getTransaction().commit();
		manager.close();

	}

}
