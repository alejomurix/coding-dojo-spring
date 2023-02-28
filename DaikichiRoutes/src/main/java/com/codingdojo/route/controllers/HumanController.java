package com.codingdojo.route.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HumanController {
	
	@GetMapping("/")	// "/" indica la raiz de la ruta o pagina de inicio
	public String home(@RequestParam(value="name", required=false, defaultValue="humano") String name,
					   @RequestParam(value="lastName", required=false) String lastName,
					   @RequestParam(value="times", required=false) Integer times) {
		String rta = "hola " + name;
		if (lastName != null) {
			rta += " " + lastName;
		}
		if (times != null) {  // objeto Integer si se puede comparar con null
			String rtaTimes = "";
			while (times > 0) {
				times--;
				rtaTimes += rta + " ";
			}
			rta = rtaTimes;
		}
		return rta;
	}
	
	/*
	@GetMapping("/names")	// "/" indica la raiz de la ruta o pagina de inicio
	public String humanName(@RequestParam(value="name") String name,
					   		@RequestParam(value="lastName") String lastName) {
		return "hola " + name + " " + lastName;
	}
	
	@GetMapping("/times")	// "/" indica la raiz de la ruta o pagina de inicio
	public String humanLastName(@RequestParam(value="name") String name,
					   @RequestParam(value="lastName") String lastName,
					   @RequestParam(value="times") int times) {
		String rta = "";
		while (times > 0) {
			rta += "hola " + name + " " + lastName + " ";
			times--;
		}
		return rta;
	}*/

}
