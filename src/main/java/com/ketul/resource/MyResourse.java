package com.ketul.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyResourse {

	@GetMapping("/")
	public String show() {
		return "demo.html";
	}
}
