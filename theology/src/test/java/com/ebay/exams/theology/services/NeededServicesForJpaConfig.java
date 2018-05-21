package com.ebay.exams.theology.services;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@TestConfiguration
public class NeededServicesForJpaConfig {
    @Bean
    public TheologyExerciseService theologyExerciseService(){
        return new TheologyExerciseServiceImpl();
    }
}
