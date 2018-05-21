package com.ebay.exams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
public class MathApp {


    public static void main(String[] args) {
        SpringApplication.run(MathApp.class);
    }
}
