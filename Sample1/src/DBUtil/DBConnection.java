package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {

		public static Connection getDBConnection() {
			Connection con=null;
			try{  
				Class.forName("com.mysql.jdbc.Driver");  
				 con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/suresh","root","Suresh@2104");
				 System.out.println("Connected");
				}catch(Exception e){ System.out.println(e);}
			return con;  
		}	
}  

	


