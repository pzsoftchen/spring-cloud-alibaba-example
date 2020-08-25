package com.chen.nacos.discovery.p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: spring-cloud-alibaba-example
 * @class：ProviderOneApplication
 * @description: Provider
 * @author: pzsoftchen
 * @create: 08/25/2020 15:11:00
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTwoApplication.class, args);
    }


}
