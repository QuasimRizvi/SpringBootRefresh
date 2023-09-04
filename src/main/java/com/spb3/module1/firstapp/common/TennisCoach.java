package com.spb3.module1.firstapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jdk.jfr.Label;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//To override Singleton Scope
//@Lazy
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }


////    define our init method
//    @PostConstruct
//    public void doMyStartupStuff(){
//        System.out.println("In my startup method "+getClass().getSimpleName());
//    }
//
////    define our destroy method
//    @PreDestroy
//    public void doMyCleanUpStuff(){
//        System.out.println("In my cleanup method "+getClass().getSimpleName());
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice Ace Services 50 times";
    }
}
