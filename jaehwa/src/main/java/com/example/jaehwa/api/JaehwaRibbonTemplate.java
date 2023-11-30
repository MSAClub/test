package com.example.jaehwa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class JaehwaRibbonTemplate {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    public String getTest(String id) {
        System.out.println("before");
        /** 인스턴스들 중 0번째 클라이언트에 요청 */
        ResponseEntity<String> restExchange =
                /** Url : http://{applicationId}/v1/ ~~ */
                restTemplate.exchange("http://jaehwaplz/test/{id}"
                        , HttpMethod.GET, null, String.class, id);
        System.out.println("getTestpass");
        System.out.println(restExchange.getBody());
        return id + " is " + restExchange.getBody();
    }

}

