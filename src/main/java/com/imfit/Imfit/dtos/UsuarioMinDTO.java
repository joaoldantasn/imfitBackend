package com.imfit.Imfit.dtos;

import com.imfit.Imfit.entities.Usuario;

public class UsuarioMinDTO {
	
	private String name;
	private Long id;
	
	public UsuarioMinDTO() {
		
	}

	public UsuarioMinDTO(Usuario entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}
	
	
	
}
