package com.oberson.charge.model;

public enum StatusTitulo {

	PENDENETE("penedente"),
	RECEBIDO( "recebido");
	
	
	private String descricao;
	
	
	
	
	private StatusTitulo( String descricao) {
		
		this.setDescricao(descricao);
	
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
