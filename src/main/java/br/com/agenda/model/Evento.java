package br.com.agenda.model;

public class Evento {

	private Long id;
	private String descricao;

	public Evento(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "descricao=" + descricao + "] \n ";
	}	
	
}
