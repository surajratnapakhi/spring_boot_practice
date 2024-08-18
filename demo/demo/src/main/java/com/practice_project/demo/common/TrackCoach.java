package com.practice_project.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    public TrackCoach()
    {
        System.out.println("In Constr. of: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run hard for 5K";
    }

    @PostConstruct
    public void postCostructMethod()
    {
        System.out.println("In post construct method of "+getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestructMethod()
    {
        System.out.println("In pre destruct method of "+getClass().getSimpleName());
    }
}
