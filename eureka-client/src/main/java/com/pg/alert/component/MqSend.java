package com.pg.alert.component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 23:32 2017/12/20
 * @Modified By
 */
@Component
public class MqSend {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendDirectExchange(String str) {
        String context = str + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);//可以发送User对象
    }
}
