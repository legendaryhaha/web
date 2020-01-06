package com.kafka.service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

/***
 *
 * @author:fsn
 * @date: 2020/1/3 17:50
 * @description
 */
@Configuration
public class KafKaProduceServiceConfig<T> {

    @Autowired
    private KafkaTemplate<String,T> kafkaTemplate;

    public void sendMessage(String topic, T message){
        kafkaTemplate.send(topic, message);
    }


}
