package com.miatecy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.miatecy.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	@Query("Select u from Usuario u where u.nombres like :var_fil")	
	public List<Usuario> listaPorNombre(@Param("var_fil") String filtro);

}
