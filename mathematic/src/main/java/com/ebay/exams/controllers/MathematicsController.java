package com.ebay.exams.controllers;

import com.ebay.exams.model.Exercise;
import com.ebay.exams.services.MathService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/exercise")
@RequiredArgsConstructor
public class MathematicsController {
    private final MathService mathService;


    @GetMapping("/random")
    public List<Exercise> getExercises(@RequestParam(value = "amount",defaultValue = "1") Integer amount) {
        return Stream.generate(mathService::getRandomExercise).limit(amount).collect(toList());
    }
}






