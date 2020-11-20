package com.miatecy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miatecy.entity.Curso;
@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
