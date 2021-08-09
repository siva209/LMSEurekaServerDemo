package com.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekClientDemoApplication.class, args);
		System.out.println("kk");
	}

}
