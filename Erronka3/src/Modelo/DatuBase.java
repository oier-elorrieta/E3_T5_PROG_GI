package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatuBase {

  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Driver kargatu
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Konexioa sortu
			String url = "jdbc:mysql://localhost:3307/db_elorrietazinemaT5";
			String user = "root";
			String pass = "";
			
			
				Connection con = DriverManager.getConnection(url, user, pass);
				
		
		// Itxi dena ordenean
		con.close();
				
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
  

}
