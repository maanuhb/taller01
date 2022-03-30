package com.example.mjhbs1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller ("/taller")
public class TallerController  {
	@GetMapping("/")	
	public String showpage() {
		return "index.jsp";
	}
	

}
