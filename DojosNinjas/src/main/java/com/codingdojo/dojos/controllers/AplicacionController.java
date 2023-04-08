package com.codingdojo.dojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojos.models.Dojo;
import com.codingdojo.dojos.models.Ninja;
import com.codingdojo.dojos.services.AppService;

@Controller
public class AplicacionController {

	@Autowired
	private AppService service;
	
	@GetMapping("/ninjas/new")
	public String ninjaNew(@ModelAttribute("ninja") Ninja ninja,
						   Model model) {
		
		List<Dojo> dojos = service.dojosAll();
		
		model.addAttribute("ninja", ninja);
		model.addAttribute("dojos", dojos);
		return "ninjaNew.jsp";
	}
	
	@PostMapping("/ninjas/create")
	public String ninjasCreate(@Valid @ModelAttribute("ninja") Ninja ninja,
								BindingResult result,
			   					Model model) {
		
		
		return "";
	}
	
	/*@PostMapping("/create")
	public String create(@Valid @ModelAttribute("usuario") Usuario usuario,
						 BindingResult result, //Encargado de regresar los mensajes de valid
						 Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("salones", servicio.findSalones());
			return "new.jsp";
		} else {
			servicio.saveUsuario(usuario);
			return "redirect:/dashboard";
		}
		
	}*/
}













