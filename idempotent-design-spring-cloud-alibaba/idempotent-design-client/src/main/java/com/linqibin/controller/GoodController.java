package com.linqibin.controller;

import com.linqibin.bo.Example2ProductBo;
import com.linqibin.config.NacosConfig;
import com.linqibin.dto.GoodDTO;
import com.linqibin.request.GoodServiceRequest;
import com.linqibin.response.DefaultResult;
import com.linqibin.service.DistributedService;
import com.linqibin.service.GoodService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/good")
public class GoodController {
    @DubboReference(version = "1.0.0", group = "idempotent-design-user-server", retries = 4,timeout = 1000)
    private GoodService goodService;

    @DubboReference(version = "1.0.0", group = "distributed-uuid-server")
    private DistributedService distributedService;

    @Autowired
    private NacosConfig nacosConfig;

    @PostMapping(value = "/updataGoodNum")
    public DefaultResult<GoodDTO> updateGoodNum(@RequestParam("goodId") String goodId) {
        long uuid = distributedService.nextId(7, 8);
        GoodServiceRequest<Example2ProductBo> request = new GoodServiceRequest<Example2ProductBo>();
        Example2ProductBo example2ProductBo = new Example2ProductBo();
        example2ProductBo.setGoodId(Long.valueOf(goodId));
        request.setRequestData(example2ProductBo);
        if (nacosConfig.isMideng()) {
            request.setUuid(uuid + "");
        }
        return goodService.updateGoodNum(request);
    }
}
