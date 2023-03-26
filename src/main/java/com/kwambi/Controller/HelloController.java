package com.kwambi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{first_name}")
    public String Hello(@PathVariable("first_name") String name){
        return "Hello %s welcome to Spring Boot Application".formatted(name);
    }
}
