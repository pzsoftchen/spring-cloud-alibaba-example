package com.chen.nacos.discovery.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: spring-cloud-alibaba-example
 * @class：ConsumerTwoApplication
 * @description: Consumer
 * @author: pzsoftchen
 * @create: 08/25/2020 15:11:44
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerTwoApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
