package com.linqibin.service.seventeen;

import com.linqibin.bo.NewProductDetailBo;
import com.linqibin.dto.NewProductDetailDTO;

import java.util.List;

public interface NewProductDetailService {
    Integer insert(NewProductDetailDTO newProductDetailDTO);
    List<NewProductDetailDTO> select(NewProductDetailBo newProductDetailBo);
    Integer selectTotalNum(NewProductDetailBo newProductDetailBo);

}
