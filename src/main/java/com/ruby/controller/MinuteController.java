package com.ruby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ruby.model.Excercise;

@Controller
public class MinuteController {
/*	@RequestMapping(value="/addMinutes")
public String addMinute(@ModelAttribute ("excercise") Excercise excercise) {
		System.out.println("excercise:" +excercise.getMinute());
	return "redirect:addMoreMinutes.html";
}
	@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinute(@ModelAttribute ("excercise") Excercise excercise) {
			System.out.println("excercising:" +excercise.getMinute());
		return "addMinutes";
	}*/
	@RequestMapping(value="/addMinutes")
	public String addMinute(@ModelAttribute ("excercise") Excercise excercise) {
			System.out.println("excercise:" +excercise.getMinute());
		return "addMinutes";
		}
}
