package com.example.mjhbs1.controllers;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.mjhbs1.models.Student;
import com.example.mjhbs1.models.StudentDTO;

@Controller 
public class TallerController  {
	@GetMapping("/")	
	public String showpage() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showForm(Model model) {
		//model.addAttribute("registration", new Student());
		return "index.jsp";
	}

	@RequestMapping(value = "/save-data", method = RequestMethod.POST)
	public String processForm(@Valid StudentDTO register,
			BindingResult bindingResult, ModelMap model) {
		if (bindingResult.hasErrors()) {
			bindingResult
		      .getFieldErrors()
		      .forEach((error) -> System.out.println(error.getDefaultMessage()));
			return "index.jsp";
		} else {
			Student students = register.toStudent();
			model.put("firstName", students.firstName);
			model.put("lastName", students.lastName);
			model.put("idNumber", students.idNumber);
			model.put("birthdate", students.firstName);
			return "validator.jsp";
		}
	}
}
