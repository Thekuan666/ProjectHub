package com.msb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * @ Auther: yk
 * @ Date: 2022/8/16 - 08 - 16 - 11:17
 * @ Description: com.msb.pojo
 * @ version: 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

    private Integer uid;
    private String uname;
    private String password;



}
