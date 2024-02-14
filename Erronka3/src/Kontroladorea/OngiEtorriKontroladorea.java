package Kontroladorea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Vista.OngiEtorri;

public class OngiEtorriKontroladorea {

	public static void main(String[] args) {
	
		try {
            OngiEtorri frame = new OngiEtorri();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
	}


}
