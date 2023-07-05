package com.linqibin;

import com.alibaba.nacos.api.config.ConfigService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


/**
 * 使用nacos-client接入
 * @Author linqibin
 * @Date   2023/7/5 10:49
 * @Email  1214219989@qq.com
 */
@SpringBootApplication
public class Application {

    @Autowired
    private ConfigService configService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @PostConstruct
    @SneakyThrows
    private void init() {
        String config = configService.getConfig("use-nacos-client-nacos-config", "use-nacos-client-nacos-config", 2000);
        System.out.println(config);
    }
}
