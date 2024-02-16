package Kontroladorea;

import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Vista.OngiEtorri;
import Vista.Zinemak;

public class OngiEtorriKontroladorea {
			
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						OngiEtorri frame = new OngiEtorri();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
            
		
		
	}
