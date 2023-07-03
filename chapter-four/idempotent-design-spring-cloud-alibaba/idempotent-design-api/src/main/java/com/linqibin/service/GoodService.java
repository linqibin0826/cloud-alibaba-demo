package com.linqibin.service;


import com.linqibin.dto.GoodDTO;
import com.linqibin.request.GoodServiceRequest;
import com.linqibin.response.DefaultResult;

public interface GoodService {
    DefaultResult<GoodDTO> updateGoodNum(GoodServiceRequest goodServiceRequest);
}
