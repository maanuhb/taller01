package com.example.mjhbs1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller ("/taller")
public class UserController  {
	@PostMapping("/validator")
	public String showuserdata (@Valid dep, name, lastname, numberId, birthdate ) {
		
	}
}
