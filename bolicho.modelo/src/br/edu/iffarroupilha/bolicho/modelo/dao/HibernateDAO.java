package br.edu.iffarroupilha.bolicho.modelo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

public class HibernateDAO {

	private static SessionFactory fabrica;	
	
	static{ //static significa que seja qual for o método abaixo, ele será executado.
		
		Configuration cfg = new Configuration();
		// depois adicionar as demais entidades
		// após ter feito o mapeamento
		cfg.addAnnotatedClass(Cliente.class);
		cfg.configure();
		
		cfg.addAnnotatedClass(Produto.class);
		cfg.configure();
		//forma mais facil de criar uma fabrica (porém deselegante, e por isso é negligenciada pela hight society
		fabrica = cfg.buildSessionFactory(); 
		
	}
	
	public static Session getSessao(){
		return fabrica.openSession();
	}
}
