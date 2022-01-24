package com.testecalcme.teste.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.testecalcme.teste.model.Postagem;

@Repository
public interface PostagemRepository extends MongoRepository<Postagem, String> {
	
	
}
