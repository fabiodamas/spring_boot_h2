package com.springh2.aplicacao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface ClienteRepository extends PagingAndSortingRepository<Cliente, String> {

	@Query("Select c from Cliente c where c.nome like %:filtro% order by nome, email")
	public List<Cliente> findByFiltro(@Param("filtro") String filtro);

}