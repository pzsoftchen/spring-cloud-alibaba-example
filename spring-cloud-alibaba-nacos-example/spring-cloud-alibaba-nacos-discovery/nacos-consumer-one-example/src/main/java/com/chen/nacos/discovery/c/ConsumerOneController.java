package com.chen.nacos.discovery.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @program: spring-cloud-alibaba-example
 * @class：ConsumerOneController
 * @description: Controller
 * @author: pzsoftchen
 * @create: 08/25/2020 15:23:03
 **/
@RequestMapping("cone")
@Controller
public class ConsumerOneController {

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping(value = "cum-test", method = RequestMethod.GET)
    public Map<String,Object> cumTest(){
        return restTemplate.getForObject("http://service-provider-one/pone/pro-test", Map.class);
    }
}
