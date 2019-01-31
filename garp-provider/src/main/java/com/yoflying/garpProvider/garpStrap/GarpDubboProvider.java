package com.yoflying.garpProvider.garpStrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * GarpDubboProvider
 *
 * @author wjp
 * @desc
 * @date Created in 10:20 PM 2019/1/29
 */
@SpringBootApplication
public class GarpDubboProvider {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GarpDubboProvider.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
