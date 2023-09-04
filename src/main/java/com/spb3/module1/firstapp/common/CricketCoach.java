package com.spb3.module1.firstapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary Can set Primary in case we are not providing qualifier
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Spin Bowling for 5 Overs!!!!!";
    }
}
