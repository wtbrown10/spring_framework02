package com.in28minutes.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan()
public class LazyInitializationLauncherApplication {
    @Component
    class ClassA {

    }

    @Component
    @Lazy
    class ClassB{
        private ClassA classA;

        public ClassB(ClassA classA){
            System.out.println("Some Initialization Logic");
            this.classA = classA;
        }

        public String doSomthing() {
            return "doing somthing";
        }
    }

    public static void main(String[] args) {

// Create a spring context to manage GamingConfiguration class with the @bean GamingConsole & GameRunner
        try (var context = new AnnotationConfigApplicationContext
                     (LazyInitializationLauncherApplication.class))
        {
            System.out.println(context.getBean(ClassB.class).doSomthing());
        }

    }
}