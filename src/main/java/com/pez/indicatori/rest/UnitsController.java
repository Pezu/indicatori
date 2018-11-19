package com.pez.indicatori.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
					method = {RequestMethod.GET},
					produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Unit> getAll(){
		List<Unit> units = unitsRepository.findAll();
		return units;  
	}
	
	@RequestMapping(value = "/one/{id}",
			method = {RequestMethod.GET},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Unit getOne(@PathVariable("id") Integer id){
		Unit units = unitsRepository.findById(id);
		return units;  
	}

	@RequestMapping(value = "/insert",
			method = {RequestMethod.PUT},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public Unit insert(@RequestBody Unit toInsert){
		Unit newUnit = unitsRepository.save(toInsert);
		return newUnit;  
	}

	@RequestMapping(value = "/delete",
			method = {RequestMethod.DELETE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public void delete(@RequestBody Unit toDelete){
		unitsRepository.delete(toDelete);
	}
}
