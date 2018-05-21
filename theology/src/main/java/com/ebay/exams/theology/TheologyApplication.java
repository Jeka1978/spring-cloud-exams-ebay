package com.ebay.exams.theology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TheologyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheologyApplication.class, args);
	}
}
