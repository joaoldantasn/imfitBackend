package com.imfit.Imfit.dtos;

import com.imfit.Imfit.entities.Exercicio;

public class ExercicioMinDTO {
	private Long id;
	private String name;
	private String muscleGroup;
	private String imgUrl;
	private String shortDescription;
	
	public ExercicioMinDTO() {
		
	}

	public ExercicioMinDTO(Exercicio entity) {
		id = entity.getId();
		name = entity.getName();
		muscleGroup = entity.getMuscleGroup();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
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

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}	
	
}
