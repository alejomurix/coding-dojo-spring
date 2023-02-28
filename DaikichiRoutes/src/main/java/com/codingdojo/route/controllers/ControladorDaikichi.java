package com.codingdojo.route.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/daikichi")
public class ControladorDaikichi {
	
	@GetMapping("")	// "/" indica la raiz de la ruta o pagina de inicio
	public String home() {
		return "¡Bienvenido!";
	}
	
	@GetMapping("/today")	
	public String today() {
		return "¡Hoy encontrarás suerte en todos tus esfuerzos!";
	}

}
