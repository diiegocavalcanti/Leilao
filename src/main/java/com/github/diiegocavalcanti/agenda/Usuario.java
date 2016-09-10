package com.github.diiegocavalcanti.agenda;

public class Usuario {
	private String nome;
	private String email;
	
	public Usuario(String nome, String email){
		this.nome = nome;
		this.email = email;
	}
	
	public String nome(){
		return this.nome;
	}
	public String email(){
		return this.email;
	}
}