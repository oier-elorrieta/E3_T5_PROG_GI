package probak;

import Modelo.Bezeroa;
import Modelo.Erosketa;
import Modelo.Zinema;

import java.time.LocalDate;
import java.util.Arrays;

import DAO.ErosketaDAO;
import DAO.KonexioaBD;
import DAO.ZinemakDAO;
import Modelo.Areto;
import Modelo.Saioa;

public class Main {
	 private KonexioaBD konexioaBD;
	
	public Main() {
		konexioaBD = new KonexioaBD();
    }

    public static void main(String[] args) {
    	
    	  ErosketaDAO erosketaDAO = new ErosketaDAO();
          Erosketa[] erosketak = erosketaDAO.azkenErosketaLortu(); 
        for (Erosketa erosketa : erosketak) {
            System.out.println("Erosketa ID: " + erosketa.getId_erosketak());
        }

            
        

 }
}

