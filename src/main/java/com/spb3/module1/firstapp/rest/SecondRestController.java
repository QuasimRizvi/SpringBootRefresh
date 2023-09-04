package com.spb3.module1.firstapp.rest;

import com.spb3.module1.firstapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondRestController {
    private Coach coach;
//    private Coach anotherCoach;

//    Constructor Injection
    @Autowired
    public SecondRestController(@Qualifier("aquatic") Coach coach,
                                @Qualifier("tennisCoach") Coach anotherCoach) {
        System.out.println("In Constructor: "+getClass().getSimpleName());
        this.coach = coach;
//        this.anotherCoach = anotherCoach;
    }




////    Setter Injection
//    @Autowired
//    public void setCoach(Coach coach){
//        this.coach = coach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }

//    @GetMapping("/check")
//    public String check(){
////        will return true for default scope which is Singleton; and false when we use non-singleton scope
//        return "Compare Beans coach == anotherCoach "+(coach==anotherCoach);
//    }

}
