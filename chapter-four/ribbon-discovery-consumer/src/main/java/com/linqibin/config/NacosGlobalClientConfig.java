package com.linqibin.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name ="ribbon-discovery-spring-cloud-alibaba-consumer",configuration =NacosRibbonRuleConfig.class)
public class NacosGlobalClientConfig {
}
