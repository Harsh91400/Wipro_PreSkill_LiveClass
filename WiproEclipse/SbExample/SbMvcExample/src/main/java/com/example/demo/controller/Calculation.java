package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Calculation {
	@GetMapping(value="/calc")
	public String calcInput() {
		return "calc";
	}
	@GetMapping(value="/calcResult")
	public String calcResult(HttpServletRequest request, Model model) {
		int firstNo, secondNo, add;
		firstNo = Integer.parseInt(request.getParameter("firstNo"));
		secondNo = Integer.parseInt(request.getParameter("secondNo"));
		add = firstNo + secondNo;
		int sub = firstNo - secondNo;
		int mul = firstNo * secondNo;
		int divi = firstNo / secondNo;
		
		model.addAttribute("firstNo", firstNo);
		model.addAttribute("secondNo", secondNo);
		model.addAttribute("add", add);
		model.addAttribute("sub", sub);
		model.addAttribute("mul", mul);
		model.addAttribute("divi", divi);
		return "calcResult";
	}

}
