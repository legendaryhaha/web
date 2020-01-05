package com.web1.controller;

import com.web1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 * @author:fsn
 * @date: 2019/12/24 16:24
 * @description 用于测试SpringBoot
 */

@RestController
public class Web1Controller {
    @Autowired
    private IUserService userService;

    @PostMapping("/test")
    public int serverStartUp(){
        int result = userService.selectUserCount();
        return result;
    }

    //以前get带参数请求都是？xx=XX，现在直接/XX，就可以将XX映射到key
    @GetMapping("/example/{key}")
    public int getKey(@PathVariable String key){
        //此demo没有考虑字符串转数字出现异常的状况
        int result = userService.selectUserByKey(Integer.valueOf(key));
        return result;
    }
}

