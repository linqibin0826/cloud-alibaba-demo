package com.linqibin.config;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class NacosConfig {


    @Bean
    @SneakyThrows(NacosException.class)
    public ConfigService configService() {
        final Properties properties = new Properties();
        properties.setProperty(PropertyKeyConst.SERVER_ADDR, "localhost:8848");
        return NacosFactory.createConfigService(properties);

    }
}
