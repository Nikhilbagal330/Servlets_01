package com.nikhil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square extends HttpServlet {


		
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=(int)req.getAttribute("k");
		
		PrintWriter out=res.getWriter();
		out.println("output is :"+i);
	}

	}

	
	

