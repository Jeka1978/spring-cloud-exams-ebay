package com.ebay.exams.examinator.controllers;

import com.ebay.exams.examinator.model.Exercise;
import com.ebay.exams.frontendstarter.aop.FrontendRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@FrontendRestController
@RequestMapping("/api")
public class StamController {


    @EventListener(ContextRefreshedEvent.class)
    public void a(){
        System.out.println();
    }

    @GetMapping("/stam")
    public Exercise stam(){
        return Exercise.builder().question("what is the age").answer("100500").build();
    }
}
