package com.springh2.aplicacao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, String> {
	
	// public List<Produto> findByProduto(String filtro);
	
	@Query("select p from Produto p")
	public List<Produto> findAll();
}