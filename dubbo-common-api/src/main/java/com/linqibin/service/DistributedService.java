package com.linqibin.service;

public interface DistributedService {

    long nextId(final long datacenterId, final long machineId);

    long nextId();
}
