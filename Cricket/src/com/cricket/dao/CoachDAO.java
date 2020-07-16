package com.cricket.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cricket.bean.CoachBean;
import com.cricket.dbutil.DBConnection;

public class CoachDAO {
	Connection con=DBConnection.getDBConnection();
	String output="Fail";
	public String Teamname(CoachBean user) {
		//String result="";
		//System.out.println("User in dao "+user);
		if(con!=null) {
			try {
				System.out.println("register connected");
				PreparedStatement ps=con.prepareStatement("insert into teamname values(?,?)");
				ps.setString(1, user.getCoachName());
				ps.setString(2, user.getTeamName());
				int i=ps.executeUpdate();
				if(i>0) {
					output="done";
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("register output - "+output);
		}
		return output;
		
	}
}
