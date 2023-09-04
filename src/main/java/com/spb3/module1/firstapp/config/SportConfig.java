package com.spb3.module1.firstapp.config;

import com.spb3.module1.firstapp.common.Coach;
import com.spb3.module1.firstapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
