package com.codingdojo.fruty.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.codingdojo.fruty.models.Item;

@Controller
public class ItemController {
	
	@GetMapping("/")
	public String index(Model model) {
		
		ArrayList<Item> fruits = new ArrayList<>();
		fruits.add(new Item("Bayas de goji", 4.0));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Guayaba", .72));
		
		model.addAttribute("fruits", fruits);
		
		return "index.jsp";
	}

}
