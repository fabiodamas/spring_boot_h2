package com.springh2.aplicacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api")
public class ClienteController {

	@Autowired
	private ClienteRepository repository;

	@RequestMapping(value = "/find/{filtro}", method = RequestMethod.GET)
	List<Cliente> findByFiltro(@PathVariable("filtro") String filtro) {
		return repository.findByFiltro(filtro);
	}
	
	@GetMapping(value="teste1")
	String teste() {
		return "teste1";
	}

}