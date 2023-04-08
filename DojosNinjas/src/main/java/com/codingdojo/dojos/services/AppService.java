package com.codingdojo.dojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojos.models.Dojo;
import com.codingdojo.dojos.models.Ninja;
import com.codingdojo.dojos.repositories.RepositoryDojo;
import com.codingdojo.dojos.repositories.RepositoryNinja;

@Service
public class AppService {

	@Autowired
	private RepositoryDojo repDojo;
	
	@Autowired
	private RepositoryNinja repNinja;
	
	/* Seccion Dojo */
	
	public List<Dojo> dojosAll() {
		
		return repDojo.findAll();
	}
	
	/* *** */
	
	/* Seccion Ninja */
	
	public Ninja create(Ninja ninja) {
		
		return repNinja.save(ninja);
	}
}










