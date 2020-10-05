package com.jitterted.ebp.blackjack;

import java.net.BindException;

public class ServletMain {

  public static void main(String[] args) throws Exception {
    JettyServer jettyServer = new JettyServer();
    try {
      jettyServer.start();
    } catch (BindException e) {
      System.err.println("Server already running on the same port? Exception message: " + e.getMessage());
      jettyServer.stop();
      System.exit(-1);
    } catch (Exception e) {
      System.err.println("Exception occurred.");
      e.printStackTrace();
      jettyServer.stop();
      System.exit(-1);
    }
  }

}
