package com.linqibin.service;

public interface SagaOrderService {
    boolean createOrder();
    boolean compensateCreateOrder();
}
