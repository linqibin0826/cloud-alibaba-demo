package com.linqibin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Application {

    @Resource
    private RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @PostConstruct
    private void init() {
        String url="http://127.0.0.1:8848/nacos/v1/cs/configs?dataId={dataId}&group={group}";
        Map<String,String> params=new HashMap<String,String>(16);
        params.put("dataId", "use-nacos-client-nacos-config");
        params.put("group", "use-nacos-client-nacos-config");
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class, params);
        System.out.println(entity);
    }


}
