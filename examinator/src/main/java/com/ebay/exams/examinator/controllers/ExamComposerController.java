package com.ebay.exams.examinator.controllers;

import com.ebay.exams.examinator.model.Exam;
import com.ebay.exams.examinator.model.Exercise;
import com.ebay.exams.examinator.model.Section;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/exams")
@RequiredArgsConstructor
public class ExamComposerController {
    private final RestTemplate restTemplate;

    private final DiscoveryClient discoveryClient;

    private int number = 1;


    @PostMapping("/exam")
    public Exam createExam(@RequestBody Map<String, Integer> examSpec) {
        List<Section> sections = examSpec.entrySet().stream().map(entry -> {
            String title = entry.getKey();
            ServiceInstance serviceInstance = discoveryClient.getInstances(title).get(0);
            URI baseUrl = serviceInstance.getUri();
            String url = baseUrl + "/exercise/random?amount=" + entry.getValue();
            Exercise[] exercises = restTemplate.getForObject(url, Exercise[].class);
            return Section.builder().exercises(Arrays.asList(exercises)).title(title).build();
        }).collect(toList());
        return Exam.builder().sections(sections).title("Best exam #" + number++).build();

    }
}
