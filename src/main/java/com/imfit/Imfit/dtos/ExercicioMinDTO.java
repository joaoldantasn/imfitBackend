package com.imfit.Imfit.dtos;

import com.imfit.Imfit.entities.Exercicio;
import com.imfit.Imfit.projections.ExercicioMinProjection;

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
	
	public ExercicioMinDTO(ExercicioMinProjection projection) {
		id = projection.getId();
		name = projection.getName();
		muscleGroup = projection.getMuscleGroup();
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
