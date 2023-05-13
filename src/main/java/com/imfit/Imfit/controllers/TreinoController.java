package com.imfit.Imfit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imfit.Imfit.dtos.TreinoListDTO;
import com.imfit.Imfit.services.TreinoService;

@RestController
@RequestMapping(value = "/treinos")
public class TreinoController {
	
	@Autowired
	private TreinoService treinoService;
	
	@GetMapping
	public List<TreinoListDTO>findAll(){
		List<TreinoListDTO> result = treinoService.findAll();
		return result;
	}
	
}
