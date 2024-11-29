package com.example.demo;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Queue;
import org.apache.activemq.ActiveMQConnectionFactory;

public class QueueProducer {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        Connection connection = null;
        Session session = null;
        try {
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            
            Queue queue = session.createQueue("myQueue");
            MessageProducer producer = session.createProducer(queue);
            
            TextMessage message = session.createTextMessage("Hello Queue!");
            producer.send(message);
            
            System.out.println("Message sent to queue: " + message.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        } finally {
            try {
                if (session != null) session.close();
                if (connection != null) connection.close();
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
