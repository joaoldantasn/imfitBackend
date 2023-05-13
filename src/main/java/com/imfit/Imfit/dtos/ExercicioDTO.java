package com.imfit.Imfit.dtos;

import org.springframework.beans.BeanUtils;

import com.imfit.Imfit.entities.Exercicio;

public class ExercicioDTO {

	private Long id;
	private String name;
	private String muscleGroup;
	private String imgUrl;
	private String shortDescription;
	
	public ExercicioDTO() {
		
	}
	
	public ExercicioDTO(Exercicio exercicio) {
		BeanUtils.copyProperties(exercicio, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMuscleGroup() {
		return muscleGroup;
	}

	public void setMuscleGroup(String muscleGroup) {
		this.muscleGroup = muscleGroup;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	
}
