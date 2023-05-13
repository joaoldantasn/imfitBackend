package com.imfit.Imfit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imfit.Imfit.dtos.ExercicioMinDTO;
import com.imfit.Imfit.dtos.TreinoListDTO;
import com.imfit.Imfit.services.ExercicioService;
import com.imfit.Imfit.services.TreinoService;

@RestController
@RequestMapping(value = "/treinos")
public class TreinoController {
	
	@Autowired
	private TreinoService treinoService;
	
	@Autowired
	private ExercicioService exercicioService;
	
	@GetMapping
	public List<TreinoListDTO>findAll(){
		List<TreinoListDTO> result = treinoService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{treinoId}/exercicios")
	public List<ExercicioMinDTO> findByTreino(@PathVariable Long treinoId){
		List<ExercicioMinDTO> result = exercicioService.findByTreino(treinoId);
		return result;
	}
	
}
