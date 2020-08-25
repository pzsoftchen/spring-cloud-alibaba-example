package com.chen.nacos.discovery.p;

import cn.hutool.core.map.MapUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @program: spring-cloud-alibaba-example
 * @class：ProviderController
 * @description: Controller
 * @author: pzsoftchen
 * @create: 08/25/2020 15:16:53
 **/
@Controller
@RequestMapping("pone")
public class ProviderOneController {

    @RequestMapping("pro-test")
    @ResponseBody
    public Map<String, Object> proTest(){
        return MapUtil.<String, Object>builder().put("a","111").put("b","222").put("c","333").build();
    }

}
