package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemsController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list","hello spring world");
		return "items/index";
	}
}
