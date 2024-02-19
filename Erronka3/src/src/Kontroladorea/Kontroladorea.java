package Kontroladorea;

import Vista.OngiEtorri;

public class Kontroladorea {

	public static void main(String[] args) {
	
		try {
            OngiEtorri frame = new OngiEtorri();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}