package com.fromfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestFromFieldB extends HttpServlet 
{

	private static final long serialVersionUID = 1L;

   public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException 
   {
	try
	{
	
	 res.setContentType("text/html");
	 PrintWriter out=res.getWriter();
	 
	//Getting the value from the hidden field  
     String n=req.getParameter("uname");  
     out.print("Hello "+n);  

     out.close(); 
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	
  }
}
