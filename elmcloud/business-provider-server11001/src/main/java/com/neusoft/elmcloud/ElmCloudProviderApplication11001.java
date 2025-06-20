package com.neusoft.elmcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ElmCloudProviderApplication11001 {

	public static void main(String[] args) {
		SpringApplication.run(ElmCloudProviderApplication11001.class, args);
	}

}
