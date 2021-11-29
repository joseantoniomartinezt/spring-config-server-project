package com.everis.springConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigProjectApplication.class, args);
	}

}
