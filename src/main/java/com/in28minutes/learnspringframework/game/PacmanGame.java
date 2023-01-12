package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacmanGame implements GamingConsole {

    @Override
    public void up() {
    }

    @Override
    public void down() {
    }

    @Override
    public void left() {
    }

    @Override
    public void right() {
    }
}
