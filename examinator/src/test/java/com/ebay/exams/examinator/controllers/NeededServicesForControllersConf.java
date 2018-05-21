package com.ebay.exams.examinator.controllers;

import com.ebay.exams.examinator.services.ExamServiceImpl;
import com.ebay.exams.examinator.services.ExamService;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author Evgeny Borisov
 */
@TestConfiguration
public class NeededServicesForControllersConf {
    @Bean
    public ExamService examService(){
        return new ExamServiceImpl();
    }
}
