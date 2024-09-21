package com.java_22.example;

import org.springframework.boot.SpringApplication;

public class TestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.from(ExampleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
