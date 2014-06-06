package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.criteria.CriteriaQuery;

public class DAO<T> {
	
	private Class<T> classe;
	
	@PersistenceUnit(name="Livraria")
	EntityManagerFactory emf;
	
	private static EntityManager em;
	
	public DAO(Class<T>classe){
		this.classe=classe;
		em= emf.createEntityManager();
	}
	
	public void adiciona(T t){
		
		//abre a transação
		em.getTransaction().begin();
		
		//persiste o objeto
		em.persist(t);
		//comitando a transação
		em.getTransaction().commit();
		
		//fecha o entity manager
		em.close();
		
	}
	
	public List<T> listarTodos(){
		
		CriteriaQuery<T> query =em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));
		 List<T> lista =em.createQuery(query).getResultList();
		 em.close();
		 return lista;
		
	}
	
	
	
	


}
