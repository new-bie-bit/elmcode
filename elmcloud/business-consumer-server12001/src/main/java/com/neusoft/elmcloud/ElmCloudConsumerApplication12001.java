package com.neusoft.elmcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ElmCloudConsumerApplication12001 {

	public static void main(String[] args) {
		SpringApplication.run(ElmCloudConsumerApplication12001.class, args);
	}

}
