package com.nagarro.aws.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.aws.entity.Person;
import com.nagarro.aws.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepo;
	
	@Override
	public Person savePerson(Person p) {
		personRepo.save(p);
		return p;
	}
	
	@Override
	public Optional<Person> getPerson(int id) {
		return personRepo.findById(id);
	}

	
	@Override
	public List<Person> getAllPerson() {
		return (List<Person>)personRepo.findAll();
	}
}
