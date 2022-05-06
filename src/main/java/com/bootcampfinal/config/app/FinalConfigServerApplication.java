package com.bootcampfinal.config.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FinalConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalConfigServerApplication.class, args);
	}

}
