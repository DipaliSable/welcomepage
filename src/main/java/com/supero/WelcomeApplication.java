package com.supero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(WelcomeApplication.class, args);
		System.out.println("end");
	}

}
