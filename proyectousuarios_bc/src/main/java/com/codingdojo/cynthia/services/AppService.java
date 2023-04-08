package com.codingdojo.cynthia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.cynthia.modelos.*;
import com.codingdojo.cynthia.repositories.*;

@Service
public class AppService {
	
	@Autowired
	private RepositoryUsuarios repUsuarios;
	
	private RepositorySalon repSalon;
	
	public List<Usuario> findUsuarios() {
		return repUsuarios.findAll();
	}
	
	public Usuario saveUsuario(Usuario usuario) {
		return repUsuarios.save(usuario);
	}
	
	public Usuario findUsuario(Long id) {
		return repUsuarios.findById(id).orElse(null);
	}
	
	public void deleteUsuario(long id) {
		repUsuarios.deleteById(id);
	}
	
	public List<Salon> findSalones() {
		return repSalon.findAll();
	}

	public Salon findSalon(Long id) {
		return repSalon.findById(id).orElse(null);
	}
}
