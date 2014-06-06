package br.com.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.dao.DAO;
import br.com.model.Autor;

@ManagedBean
public class AutorBean {
	
	private Autor autor = new Autor();
	private List<Autor>lista =null;
	DAO<Autor> dao = new DAO<Autor>(Autor.class);
	
	public void salvar(){
		System.out.println(autor.getNmeAutor());
		dao.adiciona(autor);
		
	}
	
	public List<Autor> getListaAutores(){
		return dao.listarTodos();
		//return null;
	}
	
	public Autor getAutor(){
		return autor;
	}
	

}
