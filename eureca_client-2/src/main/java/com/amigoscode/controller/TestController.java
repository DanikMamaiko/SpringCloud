package com.amigoscode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @GetMapping("/test2")
    public String test(){
        return "main";
    }

//    @ExceptionHandler(Exception.class)
//    public ModelAndView handleException(Exception ex) {
//        ModelAndView modelAndView = new ModelAndView("error/generic_error");
//        modelAndView.addObject("errorMessage", "Произошла ошибка: " + ex.getMessage());
//        return modelAndView;
//    }

}
