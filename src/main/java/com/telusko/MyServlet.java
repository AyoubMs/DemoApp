package com.telusko;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * ServletConfig & ServletContext
 * 
*/

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	{
		try 
		{
			PrintWriter out = response.getWriter();
			out.print("Hi ");
			
			ServletContext ctx = getServletContext();
			String str = ctx.getInitParameter("Phone");
			out.println(str);
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
}
