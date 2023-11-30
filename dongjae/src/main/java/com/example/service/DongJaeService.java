package com.example.service;

import com.example.api.DongJaeRibbonTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DongJaeService {

    @Autowired
    DongJaeRibbonTemplate dongJaeRibbonTemplate;

    public String ribbon(String id) {
        return dongJaeRibbonTemplate.getName(id);
    }
}
