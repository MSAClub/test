package com.example.joonbum.service;

import com.example.joonbum.api.JoonbumRibbonTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoonbumService {
    @Autowired
    private JoonbumRibbonTemplate joonbumRibbonTemplate;

    public String getTest(String id){
        return joonbumRibbonTemplate.getTest(id);
    }
}
