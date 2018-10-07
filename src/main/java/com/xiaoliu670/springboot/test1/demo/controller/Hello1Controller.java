package com.xiaoliu670.springboot.test1.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Hello1Controller {
    @RequestMapping(value="/login1", method= RequestMethod.GET)
    public String hello(){
        String b="dev11223344";
        return "hello world springboot project";
    }
}
