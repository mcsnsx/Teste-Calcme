package com.testecalcme.teste.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testecalcme.teste.model.Postagem;
import com.testecalcme.teste.repository.PostagemRepository;
import com.testecalcme.teste.service.PostagemService;

@Service
public class PostagemServiceImpl implements PostagemService{
	
	@Autowired
	private PostagemRepository postagemRepository;

	@Override
	public List<Postagem> obterTodos() {
		return this.postagemRepository.findAll();
	}

	@Override
	public Postagem obterId(String id) {
		return this.postagemRepository
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Postagem inexistente."));
	}

	@Override
	public Postagem criar(Postagem postagem) {
		return this.postagemRepository.save(postagem);
	}
	

}
