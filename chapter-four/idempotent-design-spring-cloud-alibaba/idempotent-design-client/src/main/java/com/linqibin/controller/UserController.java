package com.linqibin.controller;

import com.linqibin.config.NacosConfig;
import com.linqibin.dto.UserDTO;
import com.linqibin.request.UserServiceRequest;
import com.linqibin.response.DefaultResult;
import com.linqibin.response.Result;
import com.linqibin.service.DistributedService;
import com.linqibin.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/user")
public class UserController {

    @DubboReference(version = "1.0.0",group ="idempotent-design-user-server",retries = 0)
    private UserService userService;

    @DubboReference(version = "1.0.0",group = "distributed-uuid-server")
    private DistributedService distributedService;

    @Autowired
    private NacosConfig nacosConfig;

    @GetMapping(value = "/getUserInfo")
    @ResponseBody
    public Result<List<UserDTO>> getUserInfo(@RequestParam String userName){
        long uuid=distributedService.nextId(7,8);
        UserServiceRequest<String> request=new UserServiceRequest();
        request.setRequestData("调用用户服务");
        request.setUserName(userName);
        request.setUuid(uuid+"");
        //return new ArrayList<UserDTO>();
        DefaultResult<List<UserDTO>> result=new DefaultResult<>();
        if(nacosConfig.isMideng()){
         //模拟幂等性场景-超时重试 100次
            for(int i=0;i<100;i++){
                result=userService.getUserInfo(request);
            }
        }else{
            result=userService.getUserInfo(request);
        }
        return result;
    }
}
