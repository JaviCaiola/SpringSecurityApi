package com.ar.restcaiola.service;

import java.util.List;

import com.ar.restcaiola.model.Skill;

public interface Skillservice {

	public List<Skill> obtenerAll();
	public Skill buscarId(Long id);
	public Skill crear(Skill sk);
	public void borrar(Long id);
	public Skill update (Skill sk);
}
