package com.potoware.springboot.error.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.potoware.springboot.error.models.domain.Usuario;

@Service
public class UsuarioServiceImplements implements UsuarioService {
	
	private List<Usuario> lista;
	
	
	public UsuarioServiceImplements() {
	this.lista = new ArrayList<>();
	this.lista.add(new Usuario(1,"Alejandro" , "Potosi"));
	this.lista.add(new Usuario(1,"Ordnajela" , "Isotop"));
	this.lista.add(new Usuario(1,"Muñeca" , "Negra"));
	this.lista.add(new Usuario(1,"Luci" , "Iluc"));
	this.lista.add(new Usuario(1,"Rocky" , "Sucio"));
	this.lista.add(new Usuario(1,"Roger" , "Regor"));
	this.lista.add(new Usuario(1,"Mono" , "Onom"));
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado= null;
		
		for(Usuario usu: lista) {
			if(id.equals(usu.getId())) {
				resultado = usu;
				break;
			}
		}
		return resultado;
	}

}
