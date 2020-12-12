package com.miatecy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ubigeo")
public class Ubigeo {
	@Id	
	private int idUbigeo;
	private String departamento;
	private String provincia;
	private String distrito;
}
