package com.hp.it.jms.simple.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQMapMessage;

public class JmsProducer implements MessageListener
{
    
    public static void main(String[] args){
        new JmsProducer().sendJmsMessage();
    }
    public void sendJmsMessage()
    {
        Connection connection = null;

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        try
        {
            connection = connectionFactory.createConnection();

            connection.start();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination adminQueue = session.createQueue("email-Queue");

            MessageProducer producer = session.createProducer(adminQueue);
            
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            MapMessage message = new ActiveMQMapMessage();

            message.setObject("11", "test1");
            producer.send(message);
        }
        catch (Exception e)
        {
            // TODO: handle exception
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
    public void onMessage(Message arg0)
    {
        // TODO Auto-generated method stub
        
    }
    
    

}
