package com.ruby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="/greeting")
public String sayHello(Model model) {
		model.addAttribute("wish", "Hello World on jsp page ");
	return "hello";
}
	
	
}
