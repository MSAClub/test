package com.example.demo.controller;

import com.example.demo.service.ZuheeService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ZuheeController {

    @Autowired
    ZuheeService zuheeService;

    @GetMapping("/test/{id}")
    public String getTest(@PathVariable String id) {
     return zuheeService.getTest(id);
    }
}
