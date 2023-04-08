package com.codingdojo.travel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.travel.models.Expense;
import com.codingdojo.travel.services.AppService;

@RestController
@RequestMapping("/api")
public class ExpenseControllerAPI {
	
	@Autowired
	private AppService appService;
	
	@GetMapping("")
	public String home() {
		return "home expenses api...";
	}
	
	@PostMapping("/expenses")
	public Expense addExpense(@RequestParam("name") String name,
							 @RequestParam("vendor") String vendor,
							 @RequestParam("amount") double amount,
							 @RequestParam("descrip") String description) {
		
		Expense e = new Expense();// Expense(name, vendor, amount, description);
		return appService.save(e);
	}
	
	@GetMapping("/expenses")
	public List<Expense> expenses() {
		return appService.findAll();
	}

}
