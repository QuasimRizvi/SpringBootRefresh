package com.spb3.module1.firstapp.common;

import org.springframework.beans.factory.annotation.Configurable;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim daily 500 meters as a warm up";
    }
}
