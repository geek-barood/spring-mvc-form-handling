package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.programcreek.helloworld.form.InputForm;

@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC.";
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String showMessage(@ModelAttribute("inputForm") InputForm inputForm, Model model) {
		System.out.println("Inside hello controller!");
		model.addAttribute("inputForm", inputForm);
		return "welcome";
	}
	
}
