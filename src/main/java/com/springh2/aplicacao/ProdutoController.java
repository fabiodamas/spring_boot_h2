package com.springh2.aplicacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@RequestMapping(value="/produto/findAll")
	List<Produto> findAll(){

		return repository.findAll();
	}

}
