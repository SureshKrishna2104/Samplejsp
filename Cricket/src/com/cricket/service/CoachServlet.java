package com.cricket.service; 

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cricket.bean.CoachBean;
import com.cricket.dao.CoachDAO;

/**
 * Servlet implementation class CoachServlet
 */
@WebServlet("/CoachServlet")
public class CoachServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String page=(String) session.getAttribute("coach");
		String result=" ";
		PrintWriter out = response.getWriter();
		CoachDAO dao=new CoachDAO();
		if(page.equals("Coach")) {
			String cname=request.getParameter("cname");
			String tname=request.getParameter("tname");
			CoachBean c=new CoachBean();
			c.setCoachName(cname);
			c.setTeamName(tname);
			result=dao.Teamname(c);
			if(result.equals("done"))
			{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Team  Created');");
			out.println("location='Coach.jsp';");
			out.println("</script>");
			}
			else 
			{
				out.println("<script type=\"text/javascript\">");
				out.println("alert('invalid ');");
				out.println("location='Coach.jsp';");
				out.println("</script>");
			}
			
	
		}
		
	}

}
