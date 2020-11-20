package com.miatecy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miatecy.entity.Materia;
import com.miatecy.service.MateriaService;

@RestController
@RequestMapping("/api/materia/")
public class MateriaController {
	@Autowired
	private MateriaService service;
	
	@GetMapping
	public ResponseEntity<List<Materia>> list() {
		return ResponseEntity.ok(service.listAll());
	}
}
