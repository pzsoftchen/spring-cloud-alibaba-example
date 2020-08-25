package com.chen.nacos.discovery.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: spring-cloud-alibaba-example
 * @class：ConsumerOneApplication
 * @description: Consumer
 * @author: pzsoftchen
 * @create: 08/25/2020 15:12:26
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOneApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
