package com.linqibin.service.seventeen;

import com.linqibin.bo.NewBaseProductInfoBo;
import com.linqibin.dto.NewBaseProductInfoDTO;

import java.util.List;

public interface NewBaseProductInfoService {
    Integer insert(NewBaseProductInfoDTO newBaseProductInfoDTO);
    List<NewBaseProductInfoDTO> select(NewBaseProductInfoBo newBaseProductInfoBo);
    Integer selectTotalNum(NewBaseProductInfoBo newBaseProductInfoBo);
}
