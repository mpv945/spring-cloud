package com.haijun.mq;

import com.pg.alert.ClientApplication;
import com.pg.alert.component.MqSend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 23:57 2017/12/20
 * @Modified By
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {ClientApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
//@TestPropertySource("classpath:application.yml")
public class MqTest {

    @Autowired
    private MqSend mqSend;

    @Test
    public void hello() throws Exception {
        mqSend.sendDirectExchange("测试");
    }

}
