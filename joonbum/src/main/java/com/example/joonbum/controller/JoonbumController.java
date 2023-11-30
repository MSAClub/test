package com.example.joonbum.controller;

import com.example.joonbum.service.JoonbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JoonbumController {


    private final JoonbumService joonbumService;

    @GetMapping("/test/{id}")
    public String test(@PathVariable String id){
        return id + "joonbum";
//        return joonbumService.getTest(id);
    }
}
