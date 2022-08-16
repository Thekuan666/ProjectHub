package com.msb.controller;

import com.msb.pojo.User;
import com.msb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ Auther: yk
 * @ Date: 2022/8/16 - 08 - 16 - 11:18
 * @ Description: com.msb.controller
 * @ version: 1.0
 */
@Controller
public class Usercontroller {
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<User> findAllUser(){

        return userService.findAlluser();


    }

}
