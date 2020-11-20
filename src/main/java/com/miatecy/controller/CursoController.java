package com.miatecy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miatecy.entity.Curso;
import com.miatecy.service.CursoService;

@RestController
@RequestMapping("/api/curso/")
public class CursoController {
	@Autowired
	private CursoService service;
	
	@PostMapping
	public ResponseEntity<Curso> insert(@RequestBody Curso obj){
		return ResponseEntity.ok(service.insert(obj));
	}
	
	@GetMapping("list")
	public ResponseEntity<List<Curso>> list() {
		return ResponseEntity.ok(service.listAll());
	}
	
	@GetMapping("{id}")
    public Curso getCursoById(@PathVariable(value = "id") Integer cursoId) {
        return service.findById(cursoId);
    }
	
	@GetMapping("delete/{id}")
    public ResponseEntity<?> deleteCurso(@PathVariable(value = "id") Integer cursoId) {
        service.delete(cursoId);
        return ResponseEntity.ok().build();
    }
	
	
}
