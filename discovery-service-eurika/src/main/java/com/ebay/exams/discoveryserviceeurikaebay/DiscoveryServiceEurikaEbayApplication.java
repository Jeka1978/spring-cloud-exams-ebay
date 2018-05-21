package com.ebay.exams.discoveryserviceeurikaebay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceEurikaEbayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceEurikaEbayApplication.class, args);
	}
}
