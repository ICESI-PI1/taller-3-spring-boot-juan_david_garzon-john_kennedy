package com.edu.icesi.taller3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.edu.iceso.taller3.configuration")
public class Taller3Application {

	public static void main(String[] args) {
		SpringApplication.run(Taller3Application.class, args);
	}

}
