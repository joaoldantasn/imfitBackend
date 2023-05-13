package com.imfit.Imfit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imfit.Imfit.dtos.TreinoListDTO;
import com.imfit.Imfit.entities.Treino;
import com.imfit.Imfit.repositories.TreinoRepository;

@Service
public class TreinoService {
	
	@Autowired
	private TreinoRepository treinoRepository;
	
	@Transactional(readOnly = true)
	public List<TreinoListDTO> findAll(){
		List<Treino> result = treinoRepository.findAll();
		return result.stream().map(x -> new TreinoListDTO(x)).toList();
	}
	
}
