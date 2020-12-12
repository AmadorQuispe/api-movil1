package com.miatecy.service;

import java.util.List;

import com.miatecy.entity.Usuario;

public interface UsuarioService {
	public List<Usuario> listarTodos();

	public List<Usuario> listarPorNombre(String filtro);
}

