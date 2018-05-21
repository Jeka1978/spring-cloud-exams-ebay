package com.ebay.exams.examinator.dao;

import com.ebay.exams.examinator.model.Exercise;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface ExerciseDao {
    List<Exercise> getDefault();

}
