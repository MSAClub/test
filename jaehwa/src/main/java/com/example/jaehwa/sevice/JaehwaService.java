package com.example.jaehwa.sevice;

import com.example.jaehwa.api.JaehwaRibbonTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JaehwaService {
    @Autowired
    private JaehwaRibbonTemplate jaehwaRibbonTemplate;

    public String ribbon(String id) {
        return jaehwaRibbonTemplate.getTest(id);
    }

}
