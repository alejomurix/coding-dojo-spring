package com.codingdojo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")	// "/" indica la raiz de la ruta o pagina de inicio
	public String home() {
		return "hello from my controler REST.";
	}

}
