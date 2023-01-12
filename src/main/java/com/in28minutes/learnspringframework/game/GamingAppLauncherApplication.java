package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

// Create a spring context to manage GamingConfiguration class with the @bean GamingConsole & GameRunner
        try (var context = new AnnotationConfigApplicationContext
                     (GamingAppLauncherApplication.class))
        {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }

    }
}