package com.example.jaehwa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class JaehwaRibbonTemplate {
    @Autowired
    RestTemplate restTemplate;

    public String getTest(String id) {

        ResponseEntity<String> restExchange =
                /** Url : http://{applicationId}/v1/ ~~ */

                restTemplate.exchange("http://joonbum/test/{id}"
                        , HttpMethod.GET, null, String.class, id);

        return id + " is " + restExchange.getBody();
    }

}

