package com.kafka.service.controller;

import com.kafka.service.config.KafKaProduceServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 * @author:fsn
 * @date: 2020/1/6 8:56
 * @description
 */

@RestController
@RequestMapping(value = "/example")
public class MessageController {
    @Autowired
    private KafKaProduceServiceConfig config;
    @PostMapping("/v1")
    public int accept(String message){
        //这里就没有经过服务层了，直接调用配置类去发送消息
        //topic也应该写成配置才对，这里直接写死了
        config.sendMessage("kafka-test", message);
        return 1;
    }
}
