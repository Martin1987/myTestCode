package com.hp.it.jms.simple.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQMapMessage;

public class JmsConsumer implements MessageListener
{
    public void comsumMessage() {
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException e2)
        {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }
        MessageConsumer consumer = null;
        Session session = null;
        Connection connection = null;
        try {
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                    "tcp://localhost:61616");
            connection = connectionFactory.createConnection();
            connection.start();
             session = connection.createSession(false,
                    Session.AUTO_ACKNOWLEDGE);
            Destination adminQueue = session.createQueue("email-Queue");

            consumer = session.createConsumer(adminQueue);
            consumer.setMessageListener(this);
        } catch (JMSException e) {

        }
           /* try{
                ActiveMQMapMessage message = (ActiveMQMapMessage) consumer.receive();
                System.out.println("================++++++++++"+message.getMapNames().nextElement());
            }catch(JMSException e){
                if(connection!=null){
                    try {
                          connection.close();
                    } catch (JMSException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        */

    }

    public void onMessage(Message arg0)
    {
        // TODO Auto-generated method stub
        
    }
}
