package com.cts.project.ipos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class IpOsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpOsApplication.class, args);
	}

}
