package com.pg.alert;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 23:41 2017/12/20
 * @Modified By
 */
@Configuration
public class MqConfigurtion {

    /**
     * 配置一个hello队列消息
     * @return
     */
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
