package com.codingdojo.travel.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.codingdojo.travel.models.Expense;

public interface IRepositoryExpense extends CrudRepository<Expense, Long> {
	
	List<Expense> findAll();

}
