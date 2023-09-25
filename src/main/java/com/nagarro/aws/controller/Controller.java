package com.nagarro.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.aws.entity.Person;
import com.nagarro.aws.service.PersonService;

@RestController
public class Controller {

	@Autowired
	private PersonService pservice;
	@GetMapping("/")
    public List<Person> getAllPerson()
    {
		return pservice.getAllPerson();
    }
	
}
