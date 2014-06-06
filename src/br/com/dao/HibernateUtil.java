package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
	private static EntityManagerFactory emf= Persistence.createEntityManagerFactory("Livraria");
	
	
	public EntityManager getEntityManager (){
		return emf.createEntityManager();
	}
	
	public void closeEntityManager(EntityManager em){
		em.close();
	}

}
