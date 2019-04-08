package com.validator.quiz;

/**
 * autor: Danuta
 *
 * This program uses Spring MVC Validation to check user input.
 * This web application is a quiz on some Norwegian irregular verbs.
 *
 * */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringValidatorForQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringValidatorForQuizApplication.class, args);
	}

}
