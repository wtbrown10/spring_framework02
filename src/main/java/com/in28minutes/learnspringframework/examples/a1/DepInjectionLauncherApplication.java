package com.in28minutes.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class YourBusinessClass{
//Field Injection
//    @Autowired
//    Dependency1 dependency1;
//    @Autowired
//    Dependency2 dependency2;
//
//    public String toString(){
//        return "Using " + dependency1 + " and " + dependency2;
//    }
    //Constructor Injection
    // dont need to include @Autowired with constructor injection
    Dependency1 dependency1;
    Dependency2 dependency2;

    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}
@Configuration
@ComponentScan()
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {

// Create a spring context to manage GamingConfiguration class with the @bean GamingConsole & GameRunner
        try (var context = new AnnotationConfigApplicationContext
                     (DepInjectionLauncherApplication.class))
        {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }

    }
}