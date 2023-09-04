package com.spb3.module1.firstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello Rest Controller";
    }

    @GetMapping("/devtools")
    public String demoDevTools(){
        return "Auto Reloading Devtools";
    }
}
