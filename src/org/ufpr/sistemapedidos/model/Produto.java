package org.ufpr.sistemapedidos.model;

public class Produto {

	private int id;
	private String descricao;

	public Produto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	// GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
