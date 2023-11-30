package com.example.dongjae.controller;

import com.example.dongjae.service.DongJaeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DongJaeController {
    @Autowired
    DongJaeService dongJaeService;

    @GetMapping("/test/{id}")
    public String getTest(@PathVariable String id) {
        System.out.println("????");
        System.out.println(id);
        return dongJaeService.ribbon(id);
    }
}
