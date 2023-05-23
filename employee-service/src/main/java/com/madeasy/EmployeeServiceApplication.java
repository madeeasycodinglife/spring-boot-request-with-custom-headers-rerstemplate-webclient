package com.madeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class EmployeeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

    @Bean
//    @LoadBalanced // spring-cloud-starter-loadbalancer
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    // webclient bean
    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }
}
