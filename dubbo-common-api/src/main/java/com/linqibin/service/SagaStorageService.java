package com.linqibin.service;

public interface SagaStorageService {
    boolean storageDeduction();
    boolean compensateStorageDeduction();
}
