package com.linqibin.controller;

import com.linqibin.service.PayService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/pay")
public class PayController {

    @Resource
    private PayService payService;

    public String pay() {
        return payService.pay();
    }
}
