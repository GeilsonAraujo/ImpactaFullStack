package br.edu.ifce.code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.model.Aluno;

public class JpaAluno {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TJW");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Aluno a = new Aluno();
		a.setBairro("Mondubim");
		a.setCep("60762495");
		a.setCidade("Fortaleza");
		a.setCPF("06367185305");
		a.setNome("Preto Parker");
		a.setRG("numero de rg");
		a.setEndereco("Rua primeiro de abril");
		
		manager.persist(a);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
