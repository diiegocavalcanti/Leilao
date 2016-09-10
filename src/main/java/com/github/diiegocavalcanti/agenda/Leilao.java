package com.github.diiegocavalcanti.agenda;

public class Leilao {
	private Usuario dono;
	private String nome;
	private String descricao;
	
	public Leilao(Usuario dono, String nome, String descricao){
		this.dono = dono;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Usuario dono(){
		return dono;
	}
	public String nome(){
		return nome;
	}
	public String descricao(){
		return descricao;
	}
}
