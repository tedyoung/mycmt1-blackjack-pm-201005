package com.jitterted.ebp.blackjack;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BlackjackServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    response.setStatus(HttpServletResponse.SC_OK);
    String head = "<head><title>Blackjack</title></head>";
    String h1 = "<h1>Welcome to Blackjack!</h1>";
    String dealerDiv = "<div id='dealer'></div>";
    String playerDiv = "<div id='player'></div>";
    String bodyTag = "<body>" + h1 + dealerDiv + playerDiv + "</body>";
    response.getWriter().println("<html>" + head + bodyTag + "</html>");
  }
}
