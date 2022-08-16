package com.msb.service.impl;

import com.msb.Mapper.Usermapper;
import com.msb.pojo.User;
import com.msb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Auther: yk
 * @ Date: 2022/8/16 - 08 - 16 - 11:18
 * @ Description: com.msb.service.impl
 * @ version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private Usermapper usermapper;
    @Override
    public List<User> findAlluser() {


        return usermapper.findAlluser();
    }
}
