package com.wipro.WiproSpringboot;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	
	
	   @GetMapping("/home")
	    public ModelAndView showHomePage(Model model) {
	        model.addAttribute("message", "Welcome to Java4s Spring Boot Tutorials");

	        return new ModelAndView("home");
	    }
	
//	   
//	   @GetMapping("/login")
//	    public ModelAndView showLoginPage(Model model) {
//	        model.addAttribute("message", "Welcome to Java4s Spring Boot Tutorials");
//
//	        return new ModelAndView("login");
//	    }
//	
}
