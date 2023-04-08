package com.codingdojo.travel.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingdojo.travel.models.Expense;
import com.codingdojo.travel.repositories.IRepositoryExpense;

@Service
public class AppService {
	
	@Autowired
	private IRepositoryExpense repositoryExpense;
	
	// guarda y actualiza gasto de viaje
	public Expense save(Expense expense) {
		return repositoryExpense.save(expense);
	}
	
	public List<Expense> findAll() {
		return repositoryExpense.findAll();
	}
	
	public Expense findById(Long id) {
		return repositoryExpense.findById(id).orElse(null);
	}
	
	public void delete(Long id) {
		repositoryExpense.deleteById(id);
	}

}
