package com.ebay.exams.examinator.services;

import com.ebay.exams.examinator.dao.ExerciseDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MockBean(classes = {})
public class ExamServiceImplTest {

    @Autowired
    ExamService examService;

    @MockBean
    ExerciseDao dao;


    @Test
    public void getExercises() throws Exception {
        Mockito.when(dao.getDefault()).thenReturn(Arrays.asList());
    }

}