package com.alejo.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class FirstSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "hello world in spring boot..!";
	}
	
	@GetMapping("/products")
	public String products() {
		return "products list...";
	}
}
