package br.com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the autor database table.
 * 
 */
@Entity

public class Autor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_autor")
	private int idAutor;

	@Column(name="nme_autor")
	private String nmeAutor;

	public Autor() {
	}

	public int getIdAutor() {
		return this.idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNmeAutor() {
		return this.nmeAutor;
	}

	public void setNmeAutor(String nmeAutor) {
		this.nmeAutor = nmeAutor;
	}

}