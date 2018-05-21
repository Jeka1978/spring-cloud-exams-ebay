package com.ebay.exams.examinator.controllers;

import com.ebay.exams.examinator.model.CheckedExam;
import com.ebay.exams.examinator.model.SolvedExam;
import com.ebay.exams.examinator.services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/exams")
public class ExamController {
    @Autowired(required = false)
    private ExamService examService;



    @PostMapping("/check")
    public CheckedExam checkExam(@RequestBody SolvedExam solvedExam) {
        return examService.convert(solvedExam);
    }
}
