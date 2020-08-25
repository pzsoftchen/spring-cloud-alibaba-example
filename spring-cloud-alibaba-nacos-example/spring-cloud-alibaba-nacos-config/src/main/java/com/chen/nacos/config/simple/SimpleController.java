package com.chen.nacos.config.simple;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @program: spring-cloud-alibaba-example
 * @class：SimpleController
 * @description: SimpleController
 * @author: pzsoftchen
 * @create: 08/25/2020 11:28:53
 **/
@Slf4j
@Controller
@RequestMapping("simple")
public class SimpleController {

    @Autowired
    private SimpleProperties simpleProperties;

    @RequestMapping("test")
    @ResponseBody
    public Map<String, Object> test(){
        log.info("simpleProperties:{}", JSON.toJSONString(simpleProperties));
        return BeanUtil.beanToMap(simpleProperties);
    }


}
