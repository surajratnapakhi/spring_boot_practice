package com.practice_project.demo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    public TennisCoach() {
        System.out.println("In Constr. of: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice racket for 15 minutes.";
    }
}
