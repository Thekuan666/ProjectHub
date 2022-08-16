package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Auther: yk
 * @ Date: 2022/8/15 - 08 - 15 - 20:32
 * @ Description: com.msb.controller
 * @ version: 1.0
 */
@Controller
public class mycontroller {
    @RequestMapping("/111")
    @ResponseBody
    public String mycontroller1(){
        return "hello springboot";
    }

}
