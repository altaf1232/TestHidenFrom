package com.fromfield;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestFromFieldA extends HttpServlet
{
  
	private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException 
  {
	try
	{
		
	 res.setContentType("text/html");
	 PrintWriter out=res.getWriter();
	 
	 String n=req.getParameter("userName");
	 out.print("Welcome "+n);  
     
     //creating form that have invisible textfield  
     out.print("<form action='TestFromFieldB'>");  
     out.print("<input type='hidden' name='uname' value='"+n+"'>");  
     out.print("<input type='submit' value='go'>");  
     out.print("</form>");  
     out.close();
     
	}
	catch(Exception e) 
	{
		System.out.println(e);
	}

	  
  }
}
