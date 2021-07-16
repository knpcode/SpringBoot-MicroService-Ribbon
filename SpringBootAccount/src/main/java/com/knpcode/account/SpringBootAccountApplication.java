package com.knpcode.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAccountApplication.class, args);
	}
}
