package com.ar.restcaiola.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ar.restcaiola.model.Skill;
import com.ar.restcaiola.service.Skillservice;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

	private final Skillservice service;
	
	public SkillController(Skillservice service) {
		this.service = service;
	}
	
	@GetMapping("/getall")
	public List<Skill> obtenerAll(){
		return service.obtenerAll();
	}
	
	@PostMapping("/crear")
	public Skill crear(@RequestBody Skill sk) {
		return service.crear(sk);
	}
	
	@GetMapping("/{id}")
	public Skill obtenerId(@PathVariable Long id) {
		return service.buscarId(id);
	}
	
	@PutMapping("/{id}")
	public Skill updateSkill(@RequestBody Skill sk) {
		return service.update(sk);
	}
	
	@DeleteMapping("/{id}")
	public void borrar(@PathVariable Long id) {
		service.borrar(id);
	}
	
}
