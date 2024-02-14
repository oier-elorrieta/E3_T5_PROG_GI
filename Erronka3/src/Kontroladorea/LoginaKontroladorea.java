package Kontroladorea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LoginaKontroladorea {
	
	public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Konexioa sortu
		String url = "jdbc:mysql://localhost:3307/db_elorrietazinema";
		String user = "root";
		String pass = "";
		
		
			Connection con = DriverManager.getConnection(url, user, pass);
			
	
	}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
