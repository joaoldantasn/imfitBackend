package com.imfit.Imfit.dtos;

import com.imfit.Imfit.entities.Treino;

public class TreinoListDTO {
	private Long id;
	private String name;
	
	public TreinoListDTO() {
		
	}
	
	public TreinoListDTO(Treino treino) {
		id = treino.getId();
		name = treino.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
