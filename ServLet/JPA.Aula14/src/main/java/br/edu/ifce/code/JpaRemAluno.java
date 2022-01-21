package br.edu.ifce.code;

import javax.persistence.EntityManager;

import br.edu.ifce.model.Aluno;
import br.edu.ifce.utils.JPAUtil;

public class JpaRemAluno {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Aluno a = manager.getReference(Aluno.class, 2L);
		
		manager.remove(a);		
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		manager.close();
	}

}
