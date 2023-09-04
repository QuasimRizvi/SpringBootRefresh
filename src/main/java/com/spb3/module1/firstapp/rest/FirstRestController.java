package com.spb3.module1.firstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Value("${team.name}")
    private String teamName;

    @Value("${player.name}")
    private String playerName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello Rest Controller";
    }

    @GetMapping("/devtools")
    public String demoDevTools(){
        return "Auto Reloading Devtools";
    }
    @GetMapping("/teaminfo")
    public String teamInfo(){
        return playerName+" plays for: "+teamName;
    }
}
