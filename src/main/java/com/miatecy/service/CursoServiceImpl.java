package com.miatecy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miatecy.entity.Curso;
import com.miatecy.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository repo;
	@Override
	public List<Curso> listAll() {
		
		return repo.findAll();
	}

	@Override
	public Curso insert(Curso obj) {
		
		return repo.save(obj);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

	@Override
	public Curso findById(int id) {
		Optional<Curso> optional = repo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

}
