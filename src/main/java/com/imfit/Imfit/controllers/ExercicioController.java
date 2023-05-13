package com.imfit.Imfit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imfit.Imfit.dtos.ExercicioDTO;
import com.imfit.Imfit.dtos.ExercicioMinDTO;
import com.imfit.Imfit.services.ExercicioService;

@RestController
@RequestMapping(value="/exercicios")
public class ExercicioController {
	
	@Autowired
	private ExercicioService exercicioService;
	
	@GetMapping
	public List<ExercicioMinDTO> findAll(){
		List<ExercicioMinDTO> result = exercicioService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public ExercicioDTO findById(@PathVariable Long id){
		ExercicioDTO result = exercicioService.findById(id);
		return result;
	}
}
