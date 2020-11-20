package com.miatecy.service;

import java.util.List;

import com.miatecy.entity.Curso;

public interface CursoService {
	public abstract List<Curso> listAll();
	public abstract Curso insert(Curso obj);
	public abstract void delete(int id);
	public abstract Curso findById(int id);
}
