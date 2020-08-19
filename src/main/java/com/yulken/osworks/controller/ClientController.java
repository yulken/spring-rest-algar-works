package com.yulken.osworks.controller;

import java.util.Arrays;
import java.util.List;


import com.yulken.osworks.domain.model.Client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@GetMapping("/clients")
	public List<Client> list() {
		Client c = new Client(1L, "João das Couves", "34 91234-5678", "joaodascouves@gmail.com");
		
		return Arrays.asList(c);
	}
}
