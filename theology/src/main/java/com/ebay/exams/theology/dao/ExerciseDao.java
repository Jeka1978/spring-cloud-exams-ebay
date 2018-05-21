package com.ebay.exams.theology.dao;

import com.ebay.exams.theology.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Evgeny Borisov
 */

public interface ExerciseDao extends JpaRepository<Exercise,Integer> {

}
