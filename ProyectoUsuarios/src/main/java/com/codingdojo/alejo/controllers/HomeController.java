package com.codingdojo.alejo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController  // establece que es una clase controller tipo REST
@RequestMapping("/users")
public class HomeController {
	
	//@RequestMapping(value="/", method=RequestMethod.GET) // metodo request antiguo. version generica de las peticione http
	@GetMapping("/")	// "/" indica la raiz de la ruta o pagina de inicio
	public String home() {
		return "hello from my controler REST.";
	}
									// no pueden existir rutas duplicadas, ni en controladores mvc
	@GetMapping("/show")	// se deben respetar el nombre de cada ruta en toda la aplicacion
	public String showUsers() {		
		String rta ="";
		String usuarios[] = {"Elena de Troya", "Juana de Arco", "Pablo Picasso"};
		for(int i = 0; i < usuarios.length; i++) {
			rta += "<h2>"+usuarios[i]+"</h2>";
		}		
		return rta;
	}
	
	// funcion con parametro name; @RequestParam indica que la uri contiene un parametro
	// ejem: localhost:8080/hello?nombre=alejo -> ruta para @RequestParam
	@GetMapping("/hello")
	public String helloName(@RequestParam("nombre") String name) {  // @RequestAttribute ?
		String rta = "<h1>¡Hola "+name+"!</h1>";
		return rta;
	}
	
	// http://localhost:8080/users/hello2?nombre=xalejo&apellido=muri
	@GetMapping("/hello2")
	public String helloNombreApellido(@RequestParam(value="nombre") String name,
									  @RequestParam(value="apellido", required=false, defaultValue="") String last_name) {
		
		String respuesta = "<h1>¡Hola "+name+" "+last_name+" !</h1>";
		return respuesta;
	}
	
	// funcion con parametros: @PathVariable, indica que la uri contiene parametros en si misma
	// ejem: localhost:8080/hello/alejo/muri
	@GetMapping("/hello/{nombre}/{apellido}")
	public String helloPath(@PathVariable("nombre") String name,
							@PathVariable("apellido") String last_name) {
		
		String respuesta = "<h5>¡Hello "+name+" "+last_name+"!</h5>";
		return respuesta;
	}

}
