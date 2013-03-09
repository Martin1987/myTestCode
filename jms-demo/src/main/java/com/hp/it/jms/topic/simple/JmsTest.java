package com.hp.it.jms.topic.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JmsTest
{
    public static void main(String[] args) throws InterruptedException {
        //ApplicationContext context = new ClassPathXmlApplicationContext("jms-context.xml");
        JmsPublisher publisher = new JmsPublisher();
        Thread.sleep(10000);
        for(int i=0;i<100;i++){
            System.out.println(i);
            publisher.publish();
        }
        
        
        
        JmsSubscriber subscriber = new JmsSubscriber();
        subscriber.subscribTopic();
//        JmsSubscriber1 subscriber = new JmsSubscriber1();
//        subscriber.subscribTopic();
    }
}
