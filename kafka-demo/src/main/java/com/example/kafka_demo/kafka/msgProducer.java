package com.example.kafka_demo.kafka;

import com.example.kafka_demo.kafkaEvent.event;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class msgProducer {
    @Autowired
    private KafkaTemplate<String ,event> kafkaTemplate;

    private static final String TOPIC ="Hello-Kafka";
    public msgProducer(KafkaTemplate kafkaTemplate){
        this.kafkaTemplate =kafkaTemplate;
    }
    public void sendMsg(event info, int part){
        //ProducerRecord<String,event > record = new ProducerRecord<>(TOPIC,part,null,info);
        kafkaTemplate.send(TOPIC,info);
    }
}
