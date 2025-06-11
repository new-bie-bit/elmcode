package com.neusoft.elmcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ElmCloudProviderApplication11000 {

	public static void main(String[] args) {
		SpringApplication.run(ElmCloudProviderApplication11000.class, args);
	}

}
