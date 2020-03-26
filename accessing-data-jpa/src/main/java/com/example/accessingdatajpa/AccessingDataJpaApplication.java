package com.example.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {
	
	private static Logger logger = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Customer("Ajay", "Yadav"));
			repository.save(new Customer("Usha", "Yadav"));
			repository.save(new Customer("Rohit", "Gupta"));
			repository.save(new Customer("Ashish", "Ranjan"));
			
			// fetch all customers
			logger.info("Fetching all the customers");
			logger.info("---------------------------");
			for (Customer customer : repository.findAll()) {
				logger.info(customer.toString());
			}
			
			// fetch a single customer 
			logger.info("Fetching a single custoer");
			Customer customer = repository.findById(1L);
			logger.info(customer.toString());
			logger.info("");
		};
	}

}
