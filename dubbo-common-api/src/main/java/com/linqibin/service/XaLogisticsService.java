package com.linqibin.service;

import com.linqibin.bo.LogisticsServiceBo;
import com.linqibin.dto.LogisticsServiceDTO;

public interface XaLogisticsService {
    LogisticsServiceDTO notifyLogistics(LogisticsServiceBo logisticsServiceBo);
}
