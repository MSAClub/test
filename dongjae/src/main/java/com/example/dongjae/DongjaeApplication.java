package com.example.dongjae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DongjaeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DongjaeApplication.class, args);
	}

}
