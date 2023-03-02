package com.codingdojo.route.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	@GetMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "¡Felicitaciones! ¡pronto viajarás a " + city + "!";
	}
	
	@GetMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
		if (number % 2 == 0)
			return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
		else
			return "Has disfrutado de los frutos de tu trabajo, pero ahora e buen momento para pasar con familiares y amigos";
	}
	
	@GetMapping("/resp")
	public String respuesta(@RequestParam("dato") int dato) {
		return "tu dato es: " + dato;
	}

}
