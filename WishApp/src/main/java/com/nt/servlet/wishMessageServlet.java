package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class wishMessageServlet extends HttpServlet {
	
      @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	  //get printWriter
    	  PrintWriter pw=res.getWriter();
    	  //set response  content type
    	  res.setContentType("text/html");
    	
    	  //write business logic to generate the wish message
    	  LocalDateTime ldt=LocalDateTime.now();//gives current date and time
    	  pw.println("<h1 style='color:red;text-align:center'>"+ldt.toString()+"</h1>");
    	  
    	  int hour=ldt.getHour();//gives current hour of the day 0-23
    	  if(hour<12)
    		  pw.print("<h1 style='color:orange;text-align:center'>Good Morning</h1>");
    	  else if(hour<16)
    	     pw.print("<h1 style='color:green;text-align:center'>Good AfterNoon</h1>");
    	  else if(hour<20)
    		  pw.print("<h1 style='color:pink;text-align:center'>Good Evening</h1>");
    	  else
    		  pw.print("<h1 style='color:black;text-align:center'>Good Night</h1>");
    	  
    	  //add home hyperLink
    	  pw.println("<br><a href='http://localhost:3030/WishApp/page.html'>HOME</a>");
    	  
    	  //close stream
    	  pw.close();
    	
    }
}
