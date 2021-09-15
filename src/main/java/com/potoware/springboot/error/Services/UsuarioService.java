package com.potoware.springboot.error.Services;

import java.util.List;

import com.potoware.springboot.error.models.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();
	public Usuario obtenerPorId(Integer id);
}
