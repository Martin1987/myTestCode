package com.hp.it.jms.topic.simple;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsSubscriber1 implements MessageListener
{
    public static void main(String[] args0){
        new JmsSubscriber1().subscribTopic();
    }
    
    public void subscribTopic(){
        TopicSubscriber consumer = null;
        TopicSession session = null;
        TopicConnection connection = null;
        try {
            TopicConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            connection = connectionFactory.createTopicConnection();
            connection.start();

            session = connection.createTopicSession(false,
                    Session.AUTO_ACKNOWLEDGE);
            Topic adminTopic = session.createTopic("test-topic");

            consumer = session.createSubscriber(adminTopic);
            
            consumer.setMessageListener(this);
            //consumer.setMessageListener(this);

            while(true){
                
            }
           
        } catch (JMSException e) {

        }finally{
            try
            {
                connection.close();
            }
            catch (JMSException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void onMessage(Message message)
    {
        TextMessage text = (TextMessage) message;
        try
        {
            System.out.println(text.getText()+"message received!");
        }
        catch (JMSException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
