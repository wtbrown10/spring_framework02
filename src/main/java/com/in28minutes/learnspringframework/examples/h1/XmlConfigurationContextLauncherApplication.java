package com.in28minutes.learnspringframework.examples.h1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;



public class XmlConfigurationContextLauncherApplication {

    public static void main(String[] args) {

// Create a spring context to manage GamingConfiguration class with the @bean GamingConsole & GameRunner
        try (var context =
                     new ClassPathXmlApplicationContext("contextConfiguration.xml"))

        {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }

    }
}