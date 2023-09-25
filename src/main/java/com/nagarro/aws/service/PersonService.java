package com.nagarro.aws.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.nagarro.aws.entity.Person;

public interface PersonService {

	public Optional<Person> getPerson(int id);
	
	public Person savePerson(Person p);
	
	public List<Person> getAllPerson();
}
