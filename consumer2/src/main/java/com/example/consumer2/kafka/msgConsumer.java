package com.example.consumer2.kafka;

import com.example.consumer2.kafkaEvent.event;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class msgConsumer {
    @KafkaListener(topics = "Hello-Kafka",groupId = "newGroup-2")
    public void listen(event info){
        System.out.println("msg received from consumer-2==>"+info);
    }
}
