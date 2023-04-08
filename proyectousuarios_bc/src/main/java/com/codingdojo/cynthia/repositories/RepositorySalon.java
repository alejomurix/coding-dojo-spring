package com.codingdojo.cynthia.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.cynthia.modelos.Salon;

@Repository
public interface RepositorySalon extends CrudRepository<Salon, Long> {
	
	List<Salon> findAll();

}
