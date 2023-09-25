package com.nagarro.aws.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {

	private String name;
	
	private String number;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", number=" + number + ", id=" + id + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Person(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
