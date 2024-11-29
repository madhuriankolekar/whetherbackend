package com.example.demo;


import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    private final JmsTemplate jmsTemplate;

    public MessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendToQueue(String message) {
        jmsTemplate.convertAndSend("myQueue", message);
    }

    public void sendToTopic(String message) {
        jmsTemplate.convertAndSend("myTopic", message);
    }
}
