package com.ebay.exams.examinator.dao;

import com.ebay.exams.examinator.model.Exercise;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Repository
public class ExerciseDaoImpl implements ExerciseDao {
    @Override
    public List<Exercise> getDefault() {
        return null;
    }
}
