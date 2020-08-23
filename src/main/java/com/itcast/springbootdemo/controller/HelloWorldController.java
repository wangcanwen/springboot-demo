package com.itcast.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
    @RequestMapping(value="/index",method= RequestMethod.GET)
    /*
    * 输出HelloWorld
    * */
    public String index(){
        return "HelloWorld";
    }
}
