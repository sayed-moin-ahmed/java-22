package com.java_22.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

@SpringBootApplication
public class ExampleApplication {

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

	@PostConstruct
	public void init() {
		var profile = env.getProperty("spring.profiles.active");
		if ((Objects.isNull(profile) || "dev".equals(profile)) && Boolean.parseBoolean(env.getProperty("spring.docker.compose.enabled"))) {
			startDockerCompose();
		}
	}

	private void startDockerCompose() {
		try {
			ProcessBuilder pb = new ProcessBuilder("docker-compose", "-f", "docker-compose.dev.yml", "up", "-d");
			Process process = pb.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			process.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
