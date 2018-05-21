package com.ebay.exams.services;

import com.ebay.exams.model.Exercise;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface MathService {
    Exercise getRandomExercise();
}
