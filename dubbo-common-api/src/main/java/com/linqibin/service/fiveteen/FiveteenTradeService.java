package com.linqibin.service.fiveteen;

import com.linqibin.bo.FiveteenTradeBo;
import com.linqibin.dto.FiveteenTradeDTO;

public interface FiveteenTradeService {
    FiveteenTradeDTO buyGoodAndCreateOrder(FiveteenTradeBo fiveteenTradeBo);
}
