package com.neusoft.elmcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication13001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication13001.class,args);
    }
}
