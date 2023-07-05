package com.linqibin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
@Data
@ConfigurationProperties("spring.linqibin")
public class NacosConfig {

    private String name;

    private String age;

    private Integer sex;
}
