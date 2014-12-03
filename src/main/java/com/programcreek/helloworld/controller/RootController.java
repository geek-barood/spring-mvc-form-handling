package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.programcreek.helloworld.form.InputForm;

@Controller
public class RootController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String startPoint(Model model) {
		System.out.println("Inside root controller...");
		model.addAttribute("inputForm", new InputForm());
		return "index";
	}
}
