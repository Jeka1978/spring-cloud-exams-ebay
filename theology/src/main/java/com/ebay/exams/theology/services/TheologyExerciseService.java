package com.ebay.exams.theology.services;

import com.ebay.exams.theology.model.Exercise;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface TheologyExerciseService {
    List<Exercise> getRandom(int amount);

    void setVersion(int version);

    int getVersion();

    void fillDB();
}
