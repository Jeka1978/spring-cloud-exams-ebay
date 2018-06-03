package com.ebay.exams.examinator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
public class ExaminatorApplication {

//	@Value("${exam.title}")
	private String title="a";

	@Scheduled(fixedDelay = 1000)
	public void printTitle() {
		System.out.println("title = " + title);
	}

	@Bean
	@Primary
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplateWithZul(RestTemplateBuilder builder) {
		return builder.build();
	}




	public static void main(String[] args) {
		SpringApplication.run(ExaminatorApplication.class, args);
	}
}
