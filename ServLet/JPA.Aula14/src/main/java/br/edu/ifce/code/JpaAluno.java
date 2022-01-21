package br.edu.ifce.code;

import javax.persistence.EntityManager;
import br.edu.ifce.model.Aluno;
import br.edu.ifce.utils.JPAUtil;

public class JpaAluno {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		manager.getTransaction().begin();
		
		Aluno a = new Aluno();
		a.setBairro("Mondubim");
		a.setCep("60762495");
		a.setCidade("Fortaleza");
		a.setCPF("06367185305");
		a.setNome("Volverine Adamantium");
		a.setRG("numero de rg");
		a.setEndereco("Rua primeiro de abril");
		
		manager.persist(a);
		
		manager.getTransaction().commit();
		manager.close();

	}

}
