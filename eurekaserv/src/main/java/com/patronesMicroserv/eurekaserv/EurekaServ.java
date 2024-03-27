package com.patronesMicroserv.eurekaserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServ {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServ.class, args);
	}

}
