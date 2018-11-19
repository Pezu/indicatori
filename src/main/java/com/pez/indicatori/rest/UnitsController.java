package com.pez.indicatori.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pez.indicatori.entities.Unit;
import com.pez.indicatori.repositories.UnitsRepository;

@RestController
@RequestMapping("/units")
public class UnitsController {
	
	@Autowired
	UnitsRepository unitsRepository;

	@RequestMapping(value = "/all",
					method = {RequestMethod.POST},
					produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Unit> get(){
		List<Unit> units = unitsRepository.findAll();
		return units;  
	}
	
}
