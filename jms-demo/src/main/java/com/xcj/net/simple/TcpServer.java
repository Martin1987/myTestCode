package com.xcj.net.simple;

import java.io.*;
import java.net.*;

import org.apache.hadoop.io.InputBuffer;

public class TcpServer implements Runnable
{
    private ServerSocket serverSocket;
    
    public TcpServer(ServerSocket serverSocket)
    {
        super();
        this.serverSocket = serverSocket;
    }

    public void run()
    {
        try
        {
          Socket socket = serverSocket.accept();
          InputStream is =  socket.getInputStream();
          OutputStream os = socket.getOutputStream();
          byte[] buffer = new byte[1987];
          int count;
          while((count = is.read(buffer))>=0){
              System.out.print(new String(buffer));
              os.write(buffer);
              os.flush();
          }
        }
        catch (IOException e)
        {
            // TODO: handle exception
        }
        
    }
    
    public static void main(String[] args){
        
    }

}
