package com.ar.restcaiola.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ar.restcaiola.model.Skill;
import com.ar.restcaiola.repository.Skillrepo;

@Service
public class SkillserviceIMPL implements Skillservice{

	/*En esta parte existen dos formas de llamar al repostorio
	 * en esta forma se inicializa la variable repo de la interface repository, y luego
	 * es procesada por el constructor de la implementacion
	 *  La otra forma es mediante la Anotacion @Autowired que realiza lo mismo pero mediante
	 * Spring, es mas recomensable de esta manera por que mantiene la modularidad del codigo
	 * y es una buena practica no utilizar la anotacion mencionada. */
	
	private final Skillrepo repo;
	
	public SkillserviceIMPL(Skillrepo repo) {
		this.repo = repo;
	}

	@Override
	public List<Skill> obtenerAll() {
		return repo.findAll();
	}

	@Override
	public Skill buscarId(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Skill crear(Skill sk) {
		return repo.save(sk);
	}

	@Override
	public void borrar(Long id) {
		repo.deleteById(id);
	}

	@Override
	public Skill update(Skill sk) {
		return repo.save(sk);
	}
	
	
}
