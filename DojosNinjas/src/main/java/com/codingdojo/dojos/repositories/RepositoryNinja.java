package com.codingdojo.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojos.models.Ninja;

public interface RepositoryNinja extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();

}
