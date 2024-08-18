package com.practice_project.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        System.out.println("In Constr. of: " + getClass().getSimpleName());
        return "Run hard for 5K";
    }
}
