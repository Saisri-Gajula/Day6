package com.learning.hello;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Servlet implementation class FibonacciServlet
 */
public class FibonacciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Generate the fibonacci sequence up to n numbers where n is the value defined by the query parameter "n".
	    //i.e. the request looks like localhost:8080/learning-web/fibonacci?n=10
	    //the response should be HTML-formatted comma-separated fibonacci numbers.
	
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println(String.format("<h1> Fibonacci!</h1>"));
		int previousnum=0,currentnum=1,nextnum,i;   
		out.println(previousnum+" , "+currentnum);//printing 0 and 1
		int num = Integer.valueOf(request.getParameter("n"));
		for(i=2;i<num;i++)//loop starts from 2 because 0 and 1 are already printed    
		{    
			nextnum=previousnum+currentnum;  
			out.print(" , "+nextnum);    
			previousnum=currentnum;    
			currentnum=nextnum;    
		}
		out.println("</body></html>");	
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		PrintWriter out = response.getWriter();
		  
		out.println("<html><body>");
		out.println(String.format("<h1> Fibonacci!</h1>"));
		int previousnum=0,currentnum=1,nextnum,i;   
		out.println(previousnum+" , "+currentnum);//printing 0 and 1
		int num = Integer.valueOf(request.getParameter("formLimit"));
		for(i=2;i<num;i++)//loop starts from 2 because 0 and 1 are already printed    
		{    
			nextnum=previousnum+currentnum;  
			out.print(" , "+nextnum);    
			previousnum=currentnum;    
			currentnum=nextnum;    
		}
		out.println("</body></html>");	
		}
  }

