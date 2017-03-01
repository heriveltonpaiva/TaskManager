package br.arquitetura.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Data: 26/02/2017
 * @author Herivelton
 *
 */
@Entity
@Table(name="modulo")
@SequenceGenerator(name="sequence", sequenceName="modulo_seq", allocationSize=1)
public class Modulo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sequence")
	private int id;

	private String nome;

	@ManyToOne
	@JoinColumn(name="id_sistema")
	private Sistema sistema;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Sistema getSistema() {
		return sistema;
	}
	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}
	
}
	