package com.example.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaConfig {

    @Bean
    public NewTopic creatingNewTopic(){
        return TopicBuilder.name("Hello-Kafka")
                .partitions(3)
                .build();
    }
}
