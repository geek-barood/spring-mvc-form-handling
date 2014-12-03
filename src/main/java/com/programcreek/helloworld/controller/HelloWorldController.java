package com.programcreek.helloworld.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.programcreek.helloworld.bo.UserBo;
import com.programcreek.helloworld.dto.UserDto;
import com.programcreek.helloworld.entity.User;
import com.programcreek.helloworld.form.InputForm;

@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC.";
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String doLogin(@ModelAttribute InputForm inputForm, Model model) {
		System.out.println("Inside login controller!");
		String username = inputForm.getUsername();
		String password = inputForm.getPassword();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/BeanLocations.xml");
		UserBo userBo = (UserBo) ctx.getBean("userBo");
		User currUser = userBo.getUserByUsername(username);
		
		UserDto userDto = new UserDto();
		if (currUser != null) {
			System.out.println("User was found: " + currUser.getFullname());
			System.out.println("its password is: " + currUser.getPassword());
			if (currUser.getPassword().equals(password)) {
				System.out.println("Password matched!");
				
				userDto.setFullname(currUser.getFullname());
				userDto.setAddress(currUser.getAddress());
				model.addAttribute("userDto", userDto);
				return "welcome";
			} else {
				System.out.println("Password didn't match: got='" + password + "' expected:'" + currUser.getPassword() + "'");
			}
		}
		String errorString = "Incorect credentials.";
		model.addAttribute("error",errorString);
		return "index";
		
	}
	
	@RequestMapping(value={"login/**", "/login**"}, method=RequestMethod.GET)
	public String doIgnore(@ModelAttribute InputForm inputForm, Model model) {
		System.out.println("Inside Ignore controller");
		return "index";
	}
}
