package com.codingdojo.fruty.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class OmikujiController {
	
	@GetMapping("")
	public String home() {
		return "omikuji.jsp";
	}
	
	@PostMapping("/process")
	public String omikujiProcess(@RequestParam("number") int number,
								@RequestParam("city") String city,
								@RequestParam("name") String name,
								@RequestParam("profesion") String profesion,
								@RequestParam("animal") String animal,
								@RequestParam("description") String description,
								HttpSession session) {
		session.setAttribute("numero", number);
		session.setAttribute("ciudad", city);
		session.setAttribute("nombre", name);
		session.setAttribute("profesion", profesion);
		session.setAttribute("animal", animal);
		session.setAttribute("descripcion", description);
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/show")
	public String show() {
		return "omikuji_show.jsp";
	}

}
