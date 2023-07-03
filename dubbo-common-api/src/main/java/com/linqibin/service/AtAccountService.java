package com.linqibin.service;

import java.math.BigDecimal;

public interface AtAccountService {
    boolean deductAccountBalance(Long userId, BigDecimal amount,Long accountId);
}
