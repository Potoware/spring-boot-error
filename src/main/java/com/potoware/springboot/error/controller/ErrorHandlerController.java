package com.potoware.springboot.error.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.potoware.springboot.error.errors.UsuarioNoEncontradoException;

@ControllerAdvice
public class ErrorHandlerController {

	@ExceptionHandler({ArithmeticException.class})
	public String aritmeticaError(Exception ex, Model model) {
		model.addAttribute("error","error de aritmética");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/aritmetica";
	}
	
	@ExceptionHandler({NumberFormatException.class})
	public String numberFormatException(Exception ex, Model model) {
		model.addAttribute("error","Formato de numero invalido");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/numero-error";
	}
	
	@ExceptionHandler({UsuarioNoEncontradoException.class})
	public String UsuarioNoEncontrado(Exception ex, Model model) {
		model.addAttribute("error","Usuario no existe en el sistema");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/usuario";
	}
}
