package com.spb3.module1.firstapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice runs!";
    }
}
