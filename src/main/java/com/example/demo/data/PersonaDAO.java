package com.example.demo.data;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Persona;

public interface  PersonaDAO extends CrudRepository<Persona, Integer> {

}
