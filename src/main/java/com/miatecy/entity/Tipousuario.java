package com.miatecy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipousuario")
public class Tipousuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoUsuario;
	private String nombre;
	private String estado;

}

