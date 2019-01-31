package com.yoflying.garpConsumer.controller;

import com.yoflying.garpConsumerApi.DemoApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
/**
 * DubboConsumerDemo
 *
 * @author wjp
 * @desc
 * @date Created in 3:50 PM 2019/1/14
 */
@RestController
public class DubboConsumerDemo {
    @Reference(
            version = "${demo.service.version}",
            url = "dubbo://127.0.0.1:12345")
    private DemoApi demoApi;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoApi.sayHello(name);
    }

}