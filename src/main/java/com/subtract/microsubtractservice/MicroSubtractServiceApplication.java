package com.subtract.microsubtractservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.subtract.controller.**")
public class MicroSubtractServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroSubtractServiceApplication.class, args);
	}

}
