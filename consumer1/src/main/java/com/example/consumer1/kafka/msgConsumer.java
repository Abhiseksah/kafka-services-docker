package com.example.consumer1.kafka;

import com.example.consumer1.kafkaEvent.event;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class msgConsumer {
    @KafkaListener(topics = "Hello-Kafka",groupId = "newGroup-1")
    public void listen(event info){
        System.out.println("msg received from consumer-1==>"+info);
    }
}
