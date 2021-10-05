package com.trishit.DisocveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DisocveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisocveryServerApplication.class, args);
	}

}
