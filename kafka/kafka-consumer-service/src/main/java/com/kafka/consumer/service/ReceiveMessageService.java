package com.kafka.consumer.service;
/***
 *
 * @author:fsn
 * @date: 2020/1/6 16:36
 * @version
 */

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author fang
 * @date 2020/1/6
 **/
@Service
public class ReceiveMessageService {
    Logger log = LoggerFactory.getLogger(ReceiveMessageService.class);

    @KafkaListener(topics = {"kafka-test"})
    public void listen(ConsumerRecord<?,?> record){
        log.info("topic={},key={},value={}",record.topic(), record.key(), record.value());
    }

}
