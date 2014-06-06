package br.com.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;

import br.com.model.Livro;

@ManagedBean
public class LivroBean {
	private Livro livro= new Livro();
	
	
	public void salvarAluno(){
		System.out.println("####### Salvando o Aluno #########");
		System.out.println("Titulo: "+livro.getNmeLivro());
		System.out.println("Preço: "+livro.getPreco());
		System.out.println("Data Publicação: "+livro.getDtaPublicacao());
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	
	

}
