package br.arquitetura.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
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
@Table(name="tarefa_sprint")
@SequenceGenerator(name="sequence", sequenceName="tarefa_sprint_seq", allocationSize=1)
public class TarefaSprint implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sequence")
	private int id;

	@ManyToOne
	@JoinColumn(name="id_sprint")
	private Sprint sprint;
	
	@ManyToOne
	@JoinColumn(name= "id_tarefa")
	private Tarefa tarefa;
	
	@Column(name="tempo_testes")
	private Integer tempoTestes;
		
	@Column(name="tempo_desenvolvimento")
	private Integer tempoDesenvolvimento;
	
	@Column(name="data_cadastro")
	private Date dataCadastro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sprint getSprint() {
		return sprint;
	}

	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public Integer getTempoTestes() {
		return tempoTestes;
	}

	public void setTempoTestes(Integer tempoTestes) {
		this.tempoTestes = tempoTestes;
	}

	public Integer getTempoDesenvolvimento() {
		return tempoDesenvolvimento;
	}

	public void setTempoDesenvolvimento(Integer tempoDesenvolvimento) {
		this.tempoDesenvolvimento = tempoDesenvolvimento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
	
}
	