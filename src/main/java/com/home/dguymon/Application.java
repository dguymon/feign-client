package com.home.dguymon;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableFeignClients
@EnableAutoConfiguration
@EnableEurekaClient
public class Application {
  
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}