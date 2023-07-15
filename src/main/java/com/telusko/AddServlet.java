package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		
		try {
//			RequestDispatcher rd = req.getRequestDispatcher("sq");
//			rd.forward(req, res);
			res.sendRedirect("sq?k=" + k);
			
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
	
}
