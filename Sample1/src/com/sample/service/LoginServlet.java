package com.sample.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.DBConnection;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
	//pw.write("Welcome!");
	String name=request.getParameter("name");
	pw.write("Welcome!");
	String email=request.getParameter("email");
	pw.write("Welcome!");
	String pwd=request.getParameter("pwd");
	
	Connection con=DBConnection.getDBConnection();
	
	try {
		PreparedStatement p=con.prepareStatement("insert into Sample values(?,?,?)");
		p.setString(1, name);
		p.setString(2, email);
		p.setString(3, pwd);
		int i=p.executeUpdate();
		pw.write(" registered!");
		if(i>0) {
			pw.println("Succesfully registered!");
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	}

	

}
