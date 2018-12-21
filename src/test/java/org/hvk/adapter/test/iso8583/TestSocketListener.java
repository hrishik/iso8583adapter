package org.hvk.adapter.test.iso8583;

import org.hvk.adapter.iso8583.Constants;
import org.hvk.adapter.iso8583.listener.SocketListener;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;


import java.io.PrintStream;
import java.io.StringReader;

import java.net.Socket;

import junit.framework.TestCase;

import org.junit.Test;

public class TestSocketListener
  extends TestCase
{
  public TestSocketListener(String string)
  {
    super(string);
  }

  public TestSocketListener()
  {
    super();
  }

  class TestRunner extends Thread
  {
    public void run()
    {
      SocketListener listener = new SocketListener();
      try
      {
        listener.listen();
      }
      catch (IOException e)
      {
        e.printStackTrace();
        fail();
      }
    }
  }
  @Test
  public void testListener()
    throws IOException
  {
    String message =
      "33834630000001 ~ISO0150000530200F23C8001A8E19018000000001000000016405" +
      "0282002612013750000000000000000060916590833834604590806091212060906" +
      "56802506568025216050282002612013=1212338346 30000001 HDFC BANK MUMBAI MH IN044A 4000" +
      "0035600000000000356AA4B62FC5F66546B012HDFCDVL1+000013HDFCDVL11100P06434677~pid" +
      "-0~REQ~I~09/06/2010 16:59:08.992 ~";
    TestRunner runner = new TestRunner();
    try
    {
      runner.start();
      Socket clientSocket =
        new Socket("127.0.0.1", Constants.SERVER_LISTENING_PORT);
      BufferedReader autoInputLine =
        new BufferedReader(new StringReader(message));
      PrintStream os = new PrintStream(clientSocket.getOutputStream());
      DataInputStream is =
        new DataInputStream(clientSocket.getInputStream());
      if (clientSocket != null && os != null && is != null)
      {
        os.println(message);
      }
      
      os.close();
      is.close();
      clientSocket.close();
    }
    catch (Exception e)
    {
      runner.stop();
      e.printStackTrace();
      fail(e.getMessage());
    }


  }
}
