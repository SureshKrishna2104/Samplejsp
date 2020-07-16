package com.sample.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sample.bean.User;
import com.sample.dao.UserDAO;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session=request.getSession();
    String page=(String)session.getAttribute("operation");
    UserDAO userdao=new UserDAO();
    String output="";
    PrintWriter out=response.getWriter();
    if(page.equals("register")) {
    	String name=request.getParameter("fname");
        String email=request.getParameter("email");
    	String password=request.getParameter("pwd");	
    	User user=new User();
    	user.setName(name);
    	user.setEmail(email);
    	user.setPassword(password);
    	if(!userdao.register(user).equals("Fail")) {
    		//out.println("<script type=\"text/javascript\">");
    		out.println("<script type=\"text/javascript\">");
			out.println("alert('User Created');");
			out.println("location='signup.html';");
			out.println("</script>");
    	}else {
    		out.println("<script type=\"text/javascript\">");
			out.println("alert('User ID already exists!!!');");
			out.println("location='login.jsp';");
			out.println("</script>");
    	}
    	
    	
    }
	}

}
