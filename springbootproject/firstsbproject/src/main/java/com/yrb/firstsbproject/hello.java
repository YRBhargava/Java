package com.yrb.firstsbproject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class hello {
    @RequestMapping("/hello");
    
    public String hello(){
        return "hello";
    }
}
