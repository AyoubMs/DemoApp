package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
	{
//		int k = (Integer) req.getAttribute("k");
		
		HttpSession session = req.getSession();
		
		int k = (Integer) session.getAttribute("k");
		k = k * k;
		
		try {
			PrintWriter out = res.getWriter();
			out.println("result is " + k);
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println("sq called");
	}
}
