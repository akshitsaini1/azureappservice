package com.nagarro.aws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.aws.entity.Person;
@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
