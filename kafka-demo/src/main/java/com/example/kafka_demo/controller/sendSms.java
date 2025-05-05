package com.example.kafka_demo.controller;

import com.example.kafka_demo.kafka.msgProducer;
import com.example.kafka_demo.kafkaEvent.event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sendsms")
public class sendSms {
    @Autowired
    private msgProducer msgProducer;

    @PostMapping
    public ResponseEntity<String> sendMsg(@RequestBody event info,
                                          @RequestParam(defaultValue = "0") int partition){
        for(int i=0;i<10;i++){
            String newSms = info +"-"+i;
            msgProducer.sendMsg(info, partition);
        }
        return ResponseEntity.ok("response="+ info +"-"+partition);
    }
}
