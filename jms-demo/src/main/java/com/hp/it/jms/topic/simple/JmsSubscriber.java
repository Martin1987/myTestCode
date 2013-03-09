package com.hp.it.jms.topic.simple;

import javax.jms.*;

import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsSubscriber implements MessageListener
{
    
    public static void main(String[] args0){
        new JmsSubscriber().subscribTopic();
    }
    
    public void subscribTopic(){
        TopicSession session = null;
        TopicConnection connection = null;
        try {
            TopicConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            connection = connectionFactory.createTopicConnection();
            connection.start();
            session = connection.createTopicSession(false,
                    Session.AUTO_ACKNOWLEDGE);
            Topic adminTopic = session.createTopic("test-topic");

            TopicSubscriber consumer = session.createDurableSubscriber(adminTopic, "test");
 
            //TextMessage text = (TextMessage)consumer.receiveNoWait();
            //System.out.println(text.getText());
            consumer.setMessageListener(this);
           
   
            //Thread.sleep(100000);
           
        } catch (Exception e) {

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
            System.out.println(text.getText()+"====message received!");
        }
        catch (JMSException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
