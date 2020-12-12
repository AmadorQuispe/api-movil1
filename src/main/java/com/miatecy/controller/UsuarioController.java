package com.miatecy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miatecy.entity.Usuario;
import com.miatecy.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@GetMapping("/")
	public ResponseEntity<List<Usuario>> lista() {
		return ResponseEntity.ok(service.listarTodos());
	}

	@GetMapping("/porNombre/{filtro}")
	public ResponseEntity<List<Usuario>> listaPorNombre(@PathVariable("filtro") String fil) {
		return ResponseEntity.ok(service.listarPorNombre(fil + "%"));
	}
}

