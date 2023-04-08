package com.codingdojo.travel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.travel.models.Expense;
import com.codingdojo.travel.services.AppService;

@Controller
public class ExpenseController {
	
	@Autowired
	private AppService service;
	
	@GetMapping("/")
	public String index(@ModelAttribute("expense") Expense expense,
						Model model) {
		
		List<Expense> expenses = service.findAll();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	
	//add
	@PostMapping("/add")
	public String add(@Valid @ModelAttribute("expense") Expense expense,
						BindingResult result,
						Model model){
		
		if(result.hasErrors()) {
			model.addAttribute("expenses", service.findAll());
			return "index.jsp";
		} else {
			service.save(expense);
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/details/{id}")
	public String detials(@PathVariable("id") Long id,
						  Model model) {
		
		Expense viaje = service.findById(id);
		model.addAttribute("viaje", viaje);
		return "details.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id,
					   Model model) {
		
		Expense viaje = service.findById(id);
		model.addAttribute("viaje", viaje);
		return "edit.jsp";
	}
	
	@PutMapping("/update")
	public String update(@Valid @ModelAttribute("viaje") Expense viaje,
						BindingResult result) {
		
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			service.save(viaje);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		return "redirect:/";
	}

}


















