package com.jitterted.ebp.blackjack;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

public class JettyServer {
  private Server server;

  public void start() throws Exception {
    server = new Server();
    ServerConnector connector = new ServerConnector(server);
    connector.setPort(8080);
    server.setConnectors(new Connector[]{connector});

    ServletHandler servletHandler = new ServletHandler();
    server.setHandler(servletHandler);

    servletHandler.addServletWithMapping(HomeServlet.class, "/");
    servletHandler.addServletWithMapping(BlackjackServlet.class, "/blackjack");

    server.start();
  }

  public void stop() throws Exception {
    server.stop();
    server = null;
  }

}
