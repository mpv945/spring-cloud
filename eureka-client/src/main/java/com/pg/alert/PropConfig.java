package com.pg.alert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @Author: XieHaijun
 * @Description: 加载公共常量数据,可以,号隔开配置多个文件
 * @Date: Created in 17:26 2018/1/4
 * @Modified By
 */
@Configuration
@PropertySource(value = {"classpath:/config/propConfigs.properties"},ignoreResourceNotFound = true, encoding = "UTF-8")
public class PropConfig {

    /**
     * 解决@value中使用的${…}占位符。不使用${…}占位符的话，可以不使用这个bean。
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
