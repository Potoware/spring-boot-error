package com.potoware.springboot.error.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.potoware.springboot.error.Services.UsuarioService;
import com.potoware.springboot.error.models.domain.Usuario;
import com.potoware.springboot.error.errors.UsuarioNoEncontradoException;

@Controller
public class AppController {
	
	@Autowired
	private UsuarioService usuarioService;
	@SuppressWarnings("unused")
	@GetMapping("index")
	public String index() {
		//Integer valor = 10/0;
		Integer valor = Integer.parseInt("hola");
		return "index";
	}
	
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model) {
		/*Usuario usuario = usuarioService.obtenerPorId(id) ;
		if(usuario==null) {
			throw new UsuarioNoEncontradoException(id.toString());
		}*/
		Usuario usuario = usuarioService.obtenerPorIdOptional(id).orElseThrow(() -> new UsuarioNoEncontradoException(id.toString())) ;
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo","Detalle usuario; ".concat(usuario.getNombre()));
		return "ver";
	}
}
