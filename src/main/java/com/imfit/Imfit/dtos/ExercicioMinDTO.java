package com.imfit.Imfit.dtos;

import com.imfit.Imfit.entities.Exercicio;

public class ExercicioMinDTO {
	private Long id;
	private String name;
	private String muscleGroup;
	
	public ExercicioMinDTO() {
		
	}

	public ExercicioMinDTO(Exercicio entity) {
		id = entity.getId();
		name = entity.getName();
		muscleGroup = entity.getMuscleGroup();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMuscleGroup() {
		return muscleGroup;
	}


}
