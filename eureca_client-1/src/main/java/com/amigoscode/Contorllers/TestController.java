package com.amigoscode.Contorllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1")
    public String test(){
        //return "Test 1: Successful launch";
        return "/eclient2/test2";
    }

}
