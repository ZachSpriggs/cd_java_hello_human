package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RestController
public class HelloHuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HelloHuman.class, args);
	}

	@RequestMapping("/")
	public String index(@RequestParam(value ="q", required = false) String searchQuery) {
		if(searchQuery == null) {
			return "Hello Human! Welcome to SpringBoot!";
		} else {
			return "Hello " + searchQuery + "Welcome to SpringBoot!";
		}
	}
	
	@RequestMapping("/{name}")
	public String showName(@PathVariable("name") String name) {
		return "Hello " + name + " Welcome to SpringBoot!";
	}
	
	@RequestMapping("/{firstName}/{lastName}")
	public String showFullname(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return "Hello " + firstName + " " + lastName + " Welcome to SpringBoot!";
	}
	
}
