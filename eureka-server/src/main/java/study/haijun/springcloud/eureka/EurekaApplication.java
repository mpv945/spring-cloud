package study.haijun.springcloud.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by haijun on 17-7-1.
 * 使用Eureka做服务发现.
 * @author xiehaijun
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    // 日志记录
    private static final Logger logger = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        logger.warn("服务发现开始");
        SpringApplication.run(EurekaApplication.class, args);
    }

}
