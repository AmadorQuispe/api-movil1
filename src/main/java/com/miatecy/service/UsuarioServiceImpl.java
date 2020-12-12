package com.miatecy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miatecy.entity.Usuario;
import com.miatecy.repository.UsuarioRepository;
@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	
	
	@Override
	public List<Usuario> listarTodos() {
		return repository.findAll();
	}

	@Override
	public List<Usuario> listarPorNombre(String filtro) {
		return repository.listaPorNombre(filtro);
	}

}

