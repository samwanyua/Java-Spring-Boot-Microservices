package com.wanyua.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // tells spring boot that the call is a controller and can handle http requests
public class HelloController {
    @GetMapping("/hello") // endpoints are defined in this file
    public String hello(){
        return  "SpringBoot Microservices";
    }
}
