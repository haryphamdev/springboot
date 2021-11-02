package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			
				Student a =	new Student("Hary", 25,LocalDate.of(2018, 8, 30), "harypham@gmail.com");
				Student b = new Student("Alex", 25,LocalDate.of(2018, 8, 30), "harypham@gmail.com");
					
				repository.saveAll(List.of(a,b));
		};
	}

}
