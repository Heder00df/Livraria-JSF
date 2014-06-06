package br.com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the livro database table.
 * 
 */
@Entity
@NamedQuery(name="Livro.findAll", query="SELECT l FROM Livro l")
public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idlivro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dta_publicacao")
	private Date dtaPublicacao;

	private String isbn;

	@Column(name="nme_livro")
	private String nmeLivro;

	private BigDecimal preco;

	public Livro() {
	}

	public int getIdlivro() {
		return this.idlivro;
	}

	public void setIdlivro(int idlivro) {
		this.idlivro = idlivro;
	}

	public Date getDtaPublicacao() {
		return this.dtaPublicacao;
	}

	public void setDtaPublicacao(Date dtaPublicacao) {
		this.dtaPublicacao = dtaPublicacao;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNmeLivro() {
		return this.nmeLivro;
	}

	public void setNmeLivro(String nmeLivro) {
		this.nmeLivro = nmeLivro;
	}

	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}