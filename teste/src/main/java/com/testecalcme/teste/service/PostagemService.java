package com.testecalcme.teste.service;

import java.util.List;

import com.testecalcme.teste.model.Postagem;

public interface PostagemService {
	
	public List<Postagem> obterTodos();
	
	public Postagem obterId (String id);
	
	public Postagem criar(Postagem postagem);

}
