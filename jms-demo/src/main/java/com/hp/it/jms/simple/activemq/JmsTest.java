package com.hp.it.jms.simple.activemq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JmsTest
{
    public static void main(String[] args){
        //ApplicationContext context = new ClassPathXmlApplicationContext("jms-context.xml");
        /*JmsProducer producer = new JmsProducer();
        producer.sendJmsMessage();*/
        
        JmsConsumer consumer = new JmsConsumer();
        consumer.comsumMessage();
    }
}
