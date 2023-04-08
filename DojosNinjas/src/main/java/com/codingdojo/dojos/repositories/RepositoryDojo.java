package com.codingdojo.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojos.models.Dojo;

public interface RepositoryDojo extends CrudRepository<Dojo, Long> {
	
	List<Dojo> findAll();

}
