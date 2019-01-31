package com.yoflying.garpProvider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yoflying.garpProviderApi.DemoProviderApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.constraints.NotNull;

/**
 * DubboConsumerService
 *
 * @author wjp
 * @desc
 * @date Created in 10:21 PM 2019/1/29
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
@RequestMapping("/demo")
public class DubboConsumerService implements DemoProviderApi {
    @RequestMapping(value = "/sayHello",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    public String sayHello(@NotNull(message="name")String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
