package com.imfit.Imfit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imfit.Imfit.dtos.ExercicioMinDTO;
import com.imfit.Imfit.entities.Exercicio;
import com.imfit.Imfit.repositories.ExercicioRepository;

@Service
public class ExercicioService {
	
	@Autowired
	private ExercicioRepository exercicioRepository;
	
	public List<ExercicioMinDTO> findAll(){
		List<Exercicio> result = exercicioRepository.findAll();
		List<ExercicioMinDTO> dto = result.stream().map(x -> new ExercicioMinDTO(x)).toList();
		return dto;
	}
}
