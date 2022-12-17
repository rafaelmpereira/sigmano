package com.rafael.backend.controller;

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
	public Boolean status = false;
	private Boolean trocarStatus() {
		status = true;
		return status;
	}	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@CrossOrigin
	public String criar(@RequestBody String response) {
		System.out.println("Recebido: " + response);
		trocarStatus();
		return response;
	}
	@CrossOrigin
	@GetMapping
	public Boolean listar() {
		return status;
	}
}