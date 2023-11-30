package com.example.jaehwa.controller;

import com.example.jaehwa.sevice.JaehwaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JaehwaController {

    @Autowired
    private JaehwaService jaehwaService;

    @GetMapping(value = "/test/{id}")
    public String test(@PathVariable String id) {
        return jaehwaService.ribbon(id);
    }
}
