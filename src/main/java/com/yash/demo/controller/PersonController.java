package com.yash.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.demo.entity.Person;
import com.yash.demo.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons")
	public void getAllPersons(){
		while(true) {
			personService.findAllPerson();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
