package com.ebay.exams.examinator.controllers;

import com.ebay.exams.examinator.model.Exercise;
import com.ebay.exams.frontendstarter.aop.FrontendRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Evgeny Borisov
 */
@FrontendRestController
@RequestMapping("/api")
public class StamController {

    @GetMapping("/stam")
    public Exercise stam(){
        return Exercise.builder().question("what is the age").answer("100500").build();
    }
}
