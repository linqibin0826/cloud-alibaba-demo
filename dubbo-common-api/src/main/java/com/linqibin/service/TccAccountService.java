package com.linqibin.service;

import com.linqibin.bo.TccAccountServiceBo;

import java.math.BigDecimal;

public interface TccAccountService {
    boolean transformMoney(TccAccountServiceBo tccAccountServiceBo);
    void decreaseMoney(Long userId, BigDecimal money);
}
