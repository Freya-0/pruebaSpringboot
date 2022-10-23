package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.data.PersonaDAO;
import com.example.demo.domain.Persona;

@Controller
public class Controlador {
	
	@Autowired
	private PersonaDAO personaDao;
	 
	@GetMapping("/")
	public String inicio(Model model) {
		var personas = personaDao.findAll();
		
		model.addAttribute("personas", personas);
		return "inicio";
		
	}
	
	@GetMapping("/eliminar")
	public String eliminar(Persona persona) {
		personaDao.delete(persona);
		return "redirect:/";
	}
	
	
	/*
	 * Esto hace tal cosa 
	 */
	@GetMapping("/agregar")
	public String agregar(Persona persona) {
		return "agregar";
	}
	
	@PostMapping("/guardar")
	public String guardar(Persona persona) {
		personaDao.save(persona);
		return "redirect:/";
	}
	
	
	
	

}
