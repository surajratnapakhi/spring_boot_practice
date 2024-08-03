package com.practice_project.demo;

import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return ("Proctice Fast Bowling for 15 minutes.");
    }
}
