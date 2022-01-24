package com.testecalcme.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testecalcme.teste.model.Postagem;
import com.testecalcme.teste.service.PostagemService;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemService postagemService;
	
	@GetMapping
	public List<Postagem> obterTodos() {
		return this.postagemService.obterTodos();		
	}
	
	@GetMapping("/{id}")
	public Postagem obterId (@PathVariable String id) {
		return this.postagemService.obterId(id);
	}
	
	@PostMapping
	public Postagem criar(@RequestBody Postagem postagem) {
		return this.postagemService.criar(postagem);
	}
	
}
