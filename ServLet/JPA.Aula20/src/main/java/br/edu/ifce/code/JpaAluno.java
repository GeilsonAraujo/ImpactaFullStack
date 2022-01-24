package br.edu.ifce.code;

import java.io.IOException;
import java.util.Calendar;
import javax.persistence.EntityManager;
import br.edu.ifce.model.Aluno;
import br.edu.ifce.model.Endereco;
import br.edu.ifce.model.Sede;
import br.edu.ifce.model.Telefone;
import br.edu.ifce.utils.JPAUtil;
import br.edu.ifce.utils.ReadLob;


public class JpaAluno {
	public static void main (String args[]) throws IOException {
		EntityManager manager = JPAUtil.getEntityManager();
		
		manager.getTransaction().begin();
		//byte[] foto = new ReadLob().getFoto("/home/corneli/aluno.jpeg") ;
		
		Calendar c = Calendar.getInstance();
		c.set(2020, 01, 01);
		
		Aluno a = new Aluno();
		a.setNome("Joao Guilherme");
		a.setRG("9999999999");
		a.setCPF("999.999.999-99");
			
		Endereco e = new Endereco();
		e.setCep("6000-000");
		e.setCidade("Maracanau");
		e.setLogradouro("Rua dos amores");
		e.setBairro("Timbo");
		
		Telefone t1 = new Telefone();
		t1.setTelefone("99999-9999");
		t1.setTipo("Celular");
		
		Telefone t2 = new Telefone();
		t2.setTelefone("3333-3333");
		t2.setTipo("Fixo");
		
		a.getTelefone().add(t1);
		a.getTelefone().add(t2);
		
		// Aqui ocorre a definição que "e" está relacionado a "a"
		a.setEndereco(e);
		a.setIra(9.82);
		//a.setFotografia(foto);
		a.setNascimento(c);
		
		//Sede s = manager.find(Sede.class, 1L);
		
		Sede s = new Sede();
		s.setNome("IFCE-Maracanau");
		s.setDiretor("Julio Cesar");
		
		a.setSede(s);
		
		manager.persist(s);				
		manager.persist(t1);
		manager.persist(t2);
		manager.persist(e);
		manager.persist(a);
		
		
		manager.getTransaction().commit();
		manager.close();
	}
}
