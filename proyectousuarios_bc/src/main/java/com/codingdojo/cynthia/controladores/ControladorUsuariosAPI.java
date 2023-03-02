package com.codingdojo.cynthia.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codingdojo.cynthia.modelos.Usuario;
import com.codingdojo.cynthia.services.AppService;

@RestController
@RequestMapping("/api")
public class ControladorUsuariosAPI {
	
	@Autowired
	private AppService servicio;
	
	@GetMapping("")
	public String home() {
		return "home of api";
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> showUsuarios() {
		return servicio.findUsuarios();
	}
	
	@PostMapping("/usuarios")
	public Usuario crear(@RequestParam("first") String first,
			@RequestParam("last") String last,
			@RequestParam("email") String email,
			@RequestParam("pass") String pass) {
		
		Usuario u = new Usuario(first, last, email, pass);
		return servicio.saveUsuario(u);
	}
	
	@PutMapping("/usuarios/{id}")
	public Usuario actualizar(@PathVariable("id") Long id,
						@RequestParam("first") String first,
						@RequestParam("last") String last,
						@RequestParam("email") String email,
						@RequestParam("pass") String pass) {
		
		Usuario u = new Usuario(id, first, last, email, pass);
		return servicio.saveUsuario(u);
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuario mostrar(@PathVariable("id") Long id) {
		return servicio.findUsuario(id);
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void delete(@PathVariable("id") long id) {
		servicio.deleteUsuario(id);
	}

}






