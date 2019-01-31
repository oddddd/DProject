package com.yoflying.garpConsumer.garpStrap;

import com.yoflying.garpConsumer.controller.DubboConsumerDemo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * GarpDubboConsumer
 *
 * @author wjp
 * @desc
 * @date Created in 11:55 PM 2019/1/4
 */
@SpringBootApplication
public class GarpDubboConsumer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GarpDubboConsumer.class)
                .profiles("prod")
                .run(args);
    }
}
