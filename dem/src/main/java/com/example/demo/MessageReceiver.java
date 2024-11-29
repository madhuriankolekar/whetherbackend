package com.example.demo;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {

    @JmsListener(destination = "myQueue")
    public void receiveFromQueue(String message) {
        System.out.println("Received from queue: " + message);
    }

    @JmsListener(destination = "myTopic", subscription = "mySubscription")
    public void receiveFromTopic(String message) {
        System.out.println("Received from topic: " + message);
    }
}
