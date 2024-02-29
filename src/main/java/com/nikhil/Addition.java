package com.nikhil;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet{

		
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	int i= Integer.parseInt(req.getParameter("n1"));
	int j= Integer.parseInt(req.getParameter("n2"));
	String l=req.getParameter("text");
	
//	PrintWriter out=res.getWriter();
//	out.println();

	
	int k=i+j;
	
	k=k*k;
	
	req.setAttribute("k", k);
	
	
	RequestDispatcher re=req.getRequestDispatcher("two");
	re.forward(req, res);


}



}


