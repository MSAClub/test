package com.example.dongjae.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dongjae")
public class DongJaeController {

    @GetMapping("/test/{id}")
    public String getTest(@PathVariable String id) {
        System.out.println("????");
        System.out.println(id);
        return id + "dongjae";
    }
    @GetMapping("")
    public String test(){
        return "dongjae";
    }

    @GetMapping("/asd")
    public String test2(){
        return " test2";
    }
    @GetMapping("/asd2")
    public String test3(){
        return " test2";
    }


}
