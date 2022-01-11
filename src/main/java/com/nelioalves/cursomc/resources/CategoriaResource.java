package com.nelioalves.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorias")
public class CategoriaResource {

	@GetMapping("listar")
	public String listar() {
		return "REST está funcionando!";
	}
}
