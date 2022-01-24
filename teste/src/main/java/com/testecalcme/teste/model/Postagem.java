package com.testecalcme.teste.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Postagem {
	
	@Id
	private String id;
	
	@NotNull(message = "Esse campo é obrigatório!")
	private String nome;
	
	@NotNull(message = "Esse campo é obrigatório!")
	@Email(message = "Esse campo é obrigatório!")
	private String email;
	
	@NotNull(message = "Esse campo é obrigatório!")
	private String telefone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone(String telefone) {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
