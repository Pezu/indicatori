package com.pez.indicatori.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/units")
public class UnitsController {

	@RequestMapping("/all")
	  String get(){
	    return "Hello from get";
	  }
	
}
