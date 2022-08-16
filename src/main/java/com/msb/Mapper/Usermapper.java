package com.msb.Mapper;

import com.msb.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ Auther: yk
 * @ Date: 2022/8/16 - 08 - 16 - 11:17
 * @ Description: com.msb.Mapper
 * @ version: 1.0
 */
@Mapper
public interface Usermapper {
     List<User> findAlluser();
}
