package com.example.jaehwa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class JaehwaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaehwaApplication.class, args);
	}
	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate(){
		System.out.println("?ASDASD");
		return new RestTemplate();
	}
}
