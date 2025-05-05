package com.example.kafka_demo.kafka;

import com.example.kafka_demo.kafkaEvent.event;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class msgConsumer {
    @KafkaListener(topics = "Hello-Kafka",groupId = "newGroup")
    public void listen(event info){
        System.out.println("msg received from kafka demo==>"+info);
    }
}
