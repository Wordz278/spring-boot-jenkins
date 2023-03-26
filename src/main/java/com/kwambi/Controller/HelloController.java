package com.kwambi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String Hello(@PathVariable("name") String name){
        return "Hello %s welcome to Spring Boot Application".formatted(name);
    }
}
