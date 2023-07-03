package com.linqibin.service.seventeen;

import com.linqibin.bo.ProductInfoBo;
import com.linqibin.dto.ProductInfoDTO;
import java.util.List;

public interface ProductInfoService {
    Integer insert(ProductInfoDTO productInfoDTO);
    List<ProductInfoDTO> select(ProductInfoBo productInfoBo);
    Integer selectTotalNum(ProductInfoBo productInfoBo);
}