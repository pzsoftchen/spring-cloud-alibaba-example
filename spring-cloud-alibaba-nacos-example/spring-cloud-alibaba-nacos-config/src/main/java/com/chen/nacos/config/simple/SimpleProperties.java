package com.chen.nacos.config.simple;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-alibaba-example
 * @class：SimpleProperties
 * @description: SimpleProperties
 * @author: pzsoftchen
 * @create: 08/25/2020 11:28:22
 **/
@Data
@Component
@RefreshScope
@ConfigurationProperties(prefix = SimpleProperties.SIMPLE_PREFIX)
public class SimpleProperties {

    public static final String SIMPLE_PREFIX = "simple.nacos";

    private Boolean useLocalCache;
    private String extFlag;

}
