package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	private final Environment env;

	@Autowired
	public Application(Environment env) {
		this.env = env;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void printEnvs() {
		System.out.println("cloud-property: " + env.getProperty("cloud-property"));
		System.out.println("remote-property: " + env.getProperty("remote-property"));
		System.out.println("local-property: " + env.getProperty("local-property"));
		System.out.println("server.port: " + env.getProperty("server.port"));
	}
}