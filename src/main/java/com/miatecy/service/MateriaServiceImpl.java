package com.miatecy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miatecy.entity.Materia;
import com.miatecy.repository.MateriaRepository;

@Service
public class MateriaServiceImpl implements MateriaService {

	@Autowired
	private MateriaRepository repo;
	@Override
	public List<Materia> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
