package com.ebay.exams.examinator.services;

import com.ebay.exams.examinator.model.CheckedExam;
import com.ebay.exams.examinator.model.Exercise;
import com.ebay.exams.examinator.model.SolvedExam;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface ExamService {

    CheckedExam convert(SolvedExam solvedExam);

    List<Exercise> getExercises();
}
