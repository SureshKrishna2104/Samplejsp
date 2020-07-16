package com.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sample.bean.User;

import DBUtil.DBConnection;


public class UserDAO {
Connection con=DBConnection.getDBConnection();
String output="Fail";
public String register(User user) {
	//String result="";
	System.out.println("User in dao "+user);
	if(con!=null) {
		try {
			System.out.println("register connected");
			PreparedStatement ps=con.prepareStatement("insert into Sample values(?,?,?)");
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			int i=ps.executeUpdate();
			if(i>0) {
				output=user.getName();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("register output - "+output);
	}
	return output;
	
}
}
