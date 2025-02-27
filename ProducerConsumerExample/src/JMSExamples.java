


import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JMSExamples {

    public static void main(String[] args) throws NamingException, JMSException {
        // Initial Context
        InitialContext ctx = new InitialContext();

        // Lookup the ConnectionFactory from the JNDI context
        ConnectionFactory connectionFactory = (ConnectionFactory) ctx.lookup("ConnectionFactory");

        // Create a Connection
        Connection connection = connectionFactory.createConnection();

        // Start the connection
        connection.start();

        // Create a Session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // Create a Queue
        Queue queue = session.createQueue("exampleQueue");

        // Create a Topic
        Topic topic = session.createTopic("exampleTopic");

        // Create a Producer for the Queue
        MessageProducer queueProducer = session.createProducer(queue);

        // Create a Producer for the Topic
        MessageProducer topicProducer = session.createProducer(topic);

        // Create a TextMessage
        TextMessage message = session.createTextMessage("Hello, JMS!");

        // Send the message to the Queue
        queueProducer.send(message);
        System.out.println("Message sent to the Queue: " + message.getText());

        // Send the message to the Topic
        topicProducer.send(message);
        System.out.println("Message sent to the Topic: " + message.getText());

        // Create a Consumer for the Queue
        MessageConsumer queueConsumer = session.createConsumer(queue);

        // Receive the message from the Queue
        TextMessage receivedQueueMessage = (TextMessage) queueConsumer.receive();
        System.out.println("Message received from the Queue: " + receivedQueueMessage.getText());

        // Create a Consumer for the Topic
        MessageConsumer topicConsumer = session.createConsumer(topic);

        // Receive the message from the Topic
        TextMessage receivedTopicMessage = (TextMessage) topicConsumer.receive();
        System.out.println("Message received from the Topic: " + receivedTopicMessage.getText());

        // Clean up
        queueConsumer.close();
        topicConsumer.close();
        queueProducer.close();
        topicProducer.close();
        session.close();
        connection.close();
    }
}

