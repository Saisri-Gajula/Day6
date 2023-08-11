package com.learning.hello;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Servlet implementation class Passwords
 */
public class HidingPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String password = request.getParameter("password");	
		PrintWriter out = response.getWriter();
		
		 String file = "/home/pwd/eclipse-workspace/webproject/src/main/java/com/learning/hello/BannedPassword.txt";
		 Path path = Paths.get(file);
		// Path p= Files.createFile(path);
		 BufferedReader bufferedreader = Files.newBufferedReader(path);
		
		 String curLine;
         int isValid = 0;
		
		out.println("<html> <body>");
		while ((curLine = bufferedreader.readLine()) != null) {
            if(curLine.equals(password)){
        		isValid = 1;
            }
        }
		
		if(isValid == 0)
			out.println("Strong Password!");
		else
	    	out.println("Invalid Password!");
		out.println("</body></html>");
		
        

	}

}