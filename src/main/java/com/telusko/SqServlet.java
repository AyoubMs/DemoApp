package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
	{
//		int k = (Integer) req.getAttribute("k");

		int k = Integer.parseInt(req.getParameter("k"));
		k = k * k;
		
		try {
			PrintWriter out = res.getWriter();
			out.println("result is " + k);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println("sq called");
	}
}
