package com.codingdojo.cynthia.repositories;

import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.cynthia.modelos.Usuario;

public interface RepositoryUsuarios extends CrudRepository<Usuario, Long> {

	//@Query
	List<Usuario> findAll();
	
	List<Usuario> findByFirstName(String firstName);
	
	List<Usuario> findById(long id);
	
	//@SuppressWarnings("unchecked")
	Usuario save(Usuario usuario);
	
	void deleteById(long id);
}
