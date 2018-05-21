package com.ebay.exams.examinator.services;

import com.ebay.exams.examinator.dao.ExerciseDao;
import com.ebay.exams.examinator.model.CheckedExam;
import com.ebay.exams.examinator.model.Exercise;
import com.ebay.exams.examinator.model.SolvedExam;
import com.ebay.exams.examinator.services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExerciseDao dao;

    @Autowired
    private SectionDao dao2;
    @Override
    public CheckedExam convert(SolvedExam solvedExam) {
        return CheckedExam.builder().exam(solvedExam.getExam()).mark(80).build();
    }

    @Override
    public List<Exercise> getExercises() {
        return dao.getDefault();
    }
}
