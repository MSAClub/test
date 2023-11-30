package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ZuheeRibbonTemplate {
    @Autowired
    RestTemplate restTemplate;

    /** 향상된 스프링 RestTemplate을 사용해 리본 기반의 서비스를 호출 */
    public String getTest(String id){

        ResponseEntity<String> restExchange =
                /** Url : http://{applicationId}/v1/ ~~ */

                restTemplate.exchange("http://jaehwa:jaehwa:8011/test/{id}"
                        , HttpMethod.GET, null, String.class, id);

        return id + " is " + restExchange.getBody();
    }
}
