package com.in28minutes.learnspringframework.examples.exercise;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int [] retrieveData();
}
