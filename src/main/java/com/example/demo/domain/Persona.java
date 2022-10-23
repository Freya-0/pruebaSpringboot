package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Persona implements Serializable {

		private static final long serialVersionUID = 1L;
	
		@Id 
		@Column(name="IdPersona")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int idPersona;
		
		@Column(name="nombre")
		private String nombre;
		 
		@Column(name="apellido")
		private String apellido;
		
	}


