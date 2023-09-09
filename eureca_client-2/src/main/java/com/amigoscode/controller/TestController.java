package com.amigoscode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test2")
    public String test(){
        return "successful launch TEST 2";
    }

}
