package com.example.zuhee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuheeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuheeApplication.class, args);
	}

}
