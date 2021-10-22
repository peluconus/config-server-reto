package com.practica.configretoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigretoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigretoServerApplication.class, args);
	}

}
