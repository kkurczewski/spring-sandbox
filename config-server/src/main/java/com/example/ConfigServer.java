package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableConfigServer
public class ConfigServer {

	public static void main(String[] arguments) {
		SpringApplication.run(ConfigServer.class, arguments);
	}
}