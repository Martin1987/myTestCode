package com.hp.it.jms.topic.simple;

import javax.jms.*;

import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsPublisher
{
    public static void main(String[] args) throws InterruptedException{
        new JmsPublisher().publish();
        Thread.sleep(100000);
    }
    
    public void publish()
    {
        TopicConnection connection = null;

        TopicConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        try
        {
            connection = connectionFactory.createTopicConnection();

            TopicSession session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);

            Topic adminTopic = session.createTopic("test-topic");
            

            TopicPublisher publisher = session.createPublisher(adminTopic);
            
            TextMessage message = session.createTextMessage("test2");

            publisher.publish(message);
            
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.print("exception");
        }
        finally
        {
            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (JMSException e)
                {
                    e.printStackTrace();
                }
            }

        }
    }

}
