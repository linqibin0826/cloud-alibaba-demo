package com.linqibin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.linqibin.bo.Example2ProductBo;
import com.linqibin.entity.Example2ProductEntity;

import java.util.List;

public interface Example2ProductMapper extends BaseMapper<Example2ProductEntity> {
    Integer updateGoodNum(Example2ProductBo example2ProductBo);
    List<Example2ProductEntity> queryGoodInfoByGoodId(Example2ProductBo example2ProductBo);
}
