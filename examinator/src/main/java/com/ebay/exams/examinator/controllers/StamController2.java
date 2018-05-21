package com.ebay.exams.examinator.controllers;

import com.ebay.exams.frontendstarter.aop.FrontendRestController;
import com.ebay.exams.examinator.model.Exercise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api")
public class StamController2 {

    @GetMapping("/stam2")
    public Exercise stam(){
        return Exercise.builder().question("what is the age").answer("100500").build();
    }
}
