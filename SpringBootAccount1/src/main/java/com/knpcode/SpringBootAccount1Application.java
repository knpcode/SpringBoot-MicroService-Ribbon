package com.knpcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootAccount1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAccount1Application.class, args);
	}

}
