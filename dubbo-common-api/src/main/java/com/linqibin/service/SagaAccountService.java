package com.linqibin.service;

public interface SagaAccountService {
    boolean accountDeduction();
    boolean compensateAccountDeduction();
}
