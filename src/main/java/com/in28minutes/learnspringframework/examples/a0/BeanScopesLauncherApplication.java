package com.in28minutes.learnspringframework.examples.a0;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan()
public class BeanScopesLauncherApplication {
    //singleton - one object instance per spring Ioc Container
    //same instance is called everytime
    @Component
    class NormalClass{

    }
    //Prototype - many object instances per spring ioc container
    //creates new instance every time is called
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Component
    class PrototypeClass {

    }
    public static void main(String[] args) {

// Create a spring context to manage GamingConfiguration class with the @bean GamingConsole & GameRunner
        try (var context = new AnnotationConfigApplicationContext
                     (BeanScopesLauncherApplication.class))
        {
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));

            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
        }

    }
}