package com.xiaoliu670.springboot.test1.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping (value="/login", method= RequestMethod.GET)
    public String hello(){
        String a="master112233";
        return "hello world springboot project";
    }
}
