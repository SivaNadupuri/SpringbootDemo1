package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataJpaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJpaCrudApplication.class, args);
		
		System.out.println("This is Main Class");
	}

}