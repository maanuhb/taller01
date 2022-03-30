package com.example.mjhbs1.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller ("/taller")
public class UserController  {
	@PostMapping("/validator")

	public String validate(
			@RequestParam("dep") String dep,
			@RequestParam("name") String name,
			@RequestParam("lastName") String lastName,
			@RequestParam("idNumber") String idNumber,
			@RequestParam("birthdate") String birthdate, ModelMap modelMap) {
		if (Util.isDateValid(birthdate)) {
			System.out.println("valid Birthdate");
		}
		modelMap.put("dep", dep);
		modelMap.put("name", name);
		modelMap.put("lastName", lastName);
		modelMap.put("idNumber", idNumber);
		modelMap.put("birthdate", birthdate);
	}
	 	
	}

