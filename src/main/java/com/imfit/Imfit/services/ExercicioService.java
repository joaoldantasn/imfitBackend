package com.imfit.Imfit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imfit.Imfit.dtos.ExercicioDTO;
import com.imfit.Imfit.dtos.ExercicioMinDTO;
import com.imfit.Imfit.entities.Exercicio;
import com.imfit.Imfit.repositories.ExercicioRepository;

@Service
public class ExercicioService {
	
	@Autowired
	private ExercicioRepository exercicioRepository;
	
	@Transactional(readOnly = true)
	public ExercicioDTO findById(Long exercicioId) {
		Exercicio result = exercicioRepository.findById(exercicioId).get();
		ExercicioDTO dto = new ExercicioDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<ExercicioMinDTO> findAll(){
		List<Exercicio> result = exercicioRepository.findAll();
		List<ExercicioMinDTO> dto = result.stream().map(x -> new ExercicioMinDTO(x)).toList();
		return dto;
	}
	
}
