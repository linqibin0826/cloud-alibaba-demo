package com.linqibin;

import com.linqibin.config.NacosConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Resource
    private NacosConfig nacosConfig;

    @PostConstruct
    public void init() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                Runtime.getRuntime().availableProcessors(),
                60, TimeUnit.SECONDS, new LinkedBlockingDeque<>(50),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        executor.submit(() -> {

            while (true) {
                System.out.println(nacosConfig);
                Thread.sleep(1000);
            }

        });

    }
}
