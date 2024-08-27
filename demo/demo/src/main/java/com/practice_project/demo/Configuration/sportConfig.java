package com.practice_project.demo.Configuration;

import com.practice_project.demo.common.Coach;
import com.practice_project.demo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class sportConfig implements Coach {
    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
