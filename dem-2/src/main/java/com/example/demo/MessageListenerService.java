package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListenerService {

    @JmsListener(destination = "test.queue")
    public void onMessageFromQueue(String message) {
        System.out.println("Received message from queue: " + message);
    }

    @JmsListener(destination = "test.topic", containerFactory = "topicListenerFactory")
    public void onMessageFromTopic(String message) {
        System.out.println("Received message from topic: " + message);
    }
}
