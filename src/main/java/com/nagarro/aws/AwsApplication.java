package com.nagarro.aws;

import org.hibernate.boot.registry.BootstrapServiceRegistry;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.nagarro.aws.entity.Person;
import com.nagarro.aws.service.PersonService;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class AwsApplication implements CommandLineRunner {

    private static Logger LOG = (Logger) LoggerFactory.getLogger(AwsApplication.class);

	@Autowired
	private PersonService pservice;
	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(AwsApplication.class, args);
		LOG.info("APPLICATION FINISHED");
		
	}
	
	@Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");
 
        Person p = new Person("Akshit","9999");
		
		pservice.savePerson(p);
		LOG.info("Person saved");
    }

}
