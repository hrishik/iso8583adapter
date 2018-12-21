package org.hvk.adapter.iso8583.listener;

import org.hvk.adapter.iso8583.Constants;

import java.io.BufferedReader;
import java.io.DataInputStream;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketListener
{
  //TODO: Convert this to read from properties file
  static ListenerThread[] listeners =
    new ListenerThread[Constants.SERVER_THREADS];
  static ServerSocket serverSocket = null;
  static Socket clientSocket = null;
  static boolean stop_listening = false;

  public SocketListener()
  {
    super();
    //SERVER_LISTENING_PORT
  }
  
  /**
   * Start Listening
   * @throws IOException
   */
  public void listen()
    throws IOException
  {
    serverSocket = new ServerSocket(Constants.SERVER_LISTENING_PORT);
    while (!stop_listening)
    {
      clientSocket = serverSocket.accept();
      
      for (int i = 0; i <= Constants.SERVER_THREADS; i++)
      {
        if (listeners[i] == null)
        {
          (listeners[i] =
                new ListenerThread(clientSocket, listeners)).start();
          break;
        }
      }
    }
  }

  /**
   * Stop Listening to port
   */
  public void stop()
  {
    stop_listening = true;
  }
  

  /**
   * Class for Listener Thread (multiple)
   */
  class ListenerThread
    extends Thread
  {
    private Socket clientSocket = null;
    private ListenerThread t[];

    /**
     * Initialize this class
     * @param clientSocket
     * @param t
     */
    public ListenerThread(Socket clientSocket, ListenerThread[] t)
    {
      this.clientSocket = clientSocket;
      this.t = t;
    }

    /**
     * Logic to read message and put it in JMS Queue
     */
    public void run()
    {
      DataInputStream is;
      try
      {
        is = new DataInputStream(clientSocket.getInputStream());
        //TODO: Remove deprecated
        String isoMessageTxt = is.readLine();
        if (isoMessageTxt != null && !isoMessageTxt.trim().equals(""))
        {
          //process iso header, TODO: put message as it is in JMS Queue
          System.out.println(isoMessageTxt);
        }
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }
  
  
}
