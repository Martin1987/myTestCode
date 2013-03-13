package com.xcj.net;

import java.net.*;
import java.util.Enumeration;

import org.junit.Test;

public class InetTest
{
    @Test
    public void testNetworkInterface() throws SocketException{
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while(interfaces.hasMoreElements()){
            NetworkInterface nInterface = interfaces.nextElement();
            Enumeration<InetAddress> addresses = nInterface.getInetAddresses();
            while(addresses.hasMoreElements()){
                InetAddress address = addresses.nextElement();
                System.out.println(address.getHostName()+"+++"+new String(address.getHostAddress()));
            }
        }
    }
}
