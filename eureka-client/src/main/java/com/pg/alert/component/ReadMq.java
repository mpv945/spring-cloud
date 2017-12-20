package com.pg.alert.component;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 23:39 2017/12/20
 * @Modified By
 */
@Component
@RabbitListener(queues = "hello")
public class ReadMq {

    @RabbitHandler
    public void process(String hello) { //如果发送时对象，接收也可以时对象（对象是否需要序列化）
        System.out.println("Receiver : " + hello);
    }
}
