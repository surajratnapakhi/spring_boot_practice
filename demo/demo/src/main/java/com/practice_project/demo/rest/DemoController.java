package com.practice_project.demo.rest;

import com.practice_project.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;
    private Coach trackCoach;
    private Coach swimCoach;
    @Autowired
    public DemoController (@Qualifier("cricketCoach") Coach theCoach,
                           @Qualifier("cricketCoach") Coach theAnotherCoach,
                           @Qualifier("trackCoach") Coach theTrackCoach,
                           @Qualifier("swimCoach") Coach theSwimCoach)
    {
        System.out.println("In Constr. of: " + getClass().getSimpleName());
        myCoach =theCoach;
        anotherCoach=theAnotherCoach;
        trackCoach = theTrackCoach;
        swimCoach = theSwimCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return swimCoach.getDailyWorkout();
    }
    @GetMapping("/check")
    public String checkEquality()
    {
        return ("Comparing myCoach and anotherCoach: "+(myCoach==anotherCoach));
    }
}
