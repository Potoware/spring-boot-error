package com.potoware.springboot.error.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@SuppressWarnings("unused")
	@GetMapping("index")
	public String index() {
		//Integer valor = 10/0;
		Integer valor = Integer.parseInt("hola");
		return "index";
	}
}
