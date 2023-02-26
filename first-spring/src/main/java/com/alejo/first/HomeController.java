package com.alejo.first;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("")
	public String hello() {
		return "hello world in spring boot.. use controller !";
	}
	
	@RequestMapping("/world")
	public String world() {
		return "Class level annotations are cool too!";
	}

}
