package com.pg.alert.component;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 21:55 2017/12/20
 * @Modified By
 */
@Component
public class Receiver {

    /**
     * 主要方法
     * await(); // 使当前线程在锁存器倒计数至零（或者超时）之前一直等待
     * countDown(); // 递减锁存器的计数，如果计数到达零，则释放所有等待的线程
     */
    private CountDownLatch latch = new CountDownLatch(1); //具体查看CountDownLatchTest 类示例

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();//减一
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
