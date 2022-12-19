package com.rafael.backend.controller;

import com.rafael.backend.util.DataValidation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/array")
public class ArrayController {
	private DataValidation data = new DataValidation();
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@CrossOrigin
	public void validar(@RequestBody String response) throws Exception {
		data.enviarDadosMatriz(response);
	}
	
	@CrossOrigin
	@GetMapping
	public Boolean listar() throws Exception {
		return data.validaSigmano();
	}
}
