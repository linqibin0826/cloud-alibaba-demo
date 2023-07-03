package com.linqibin.impl;

import com.linqibin.service.RibbonTestService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class RibbonTestServiceImpl implements RibbonTestService {
    @Override
    public String test() {
        return "test";
    }
}
