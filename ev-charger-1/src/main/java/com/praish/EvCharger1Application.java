package com.praish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.praish.model.Charger;
import com.praish.repository.ChargerRepository;

@SpringBootApplication
public class EvCharger1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EvCharger1Application.class, args);
	}
	
	@Autowired
	private ChargerRepository chargerRepository;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Charger c1 = new Charger("Tesla", "s412", 50); chargerRepository.save(c1);
		 * 
		 * Charger c2 = new Charger("lambo", "s413", 60); chargerRepository.save(c2);
		 * 
		 * Charger c3 = new Charger("Tata", "s414", 70); chargerRepository.save(c3);
		 */
		
	}

}
