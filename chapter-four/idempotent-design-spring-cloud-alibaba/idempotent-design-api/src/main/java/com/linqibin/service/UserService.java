package com.linqibin.service;


import com.linqibin.dto.UserDTO;
import com.linqibin.request.UserServiceRequest;
import com.linqibin.response.DefaultResult;

import java.util.List;

public interface UserService {
    DefaultResult<List<UserDTO>> getUserInfo(UserServiceRequest userServiceRequest);
}
