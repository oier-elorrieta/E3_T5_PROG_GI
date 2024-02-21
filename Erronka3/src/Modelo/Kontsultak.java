package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

import DAO.AretoDAO;
import DAO.KonexioaBD;
import DAO.SaioaDAO;
import DAO.ZinemakDAO;

public class Kontsultak {
    private Zinema aukeratuZinema;
    public Areto[] aretolist;
    public Saioa[] saioalist;
    public Filma filma;
    public Areto aretoa;

    public void setAukeratuZinema(Zinema aukeratuZinema) {
        this.aukeratuZinema = aukeratuZinema;
    }


 

    public String[] FilmakZinema(String selectedZinema) {
       
            String []filmakZinema = new String[16];

            
   
			Zinema zinema = new Zinema(selectedZinema, selectedZinema,null, saioalist, aretolist);
            
            if (selectedZinema != null) {
           saioalist = zinema.getSaioalistArray() ;
            if (saioalist != null) {
            for (Saioa saioa : saioalist) {
                Filma filma = saioa.getFilma();
                if (filma != null) {
                for ( int i = 0;i < filmakZinema.length; i++ ) {
                	filmakZinema[i] = filma.getIzena();                    
                }
            }
        }
           
            }
}
			return filmakZinema;
    }
    
    public void PelikularenSaioak (Saioa ordua, Saioa date) {
    	
    	
    	Saioa saioa = new Saioa(null, null, filma, aretoa);
    	
    	System.out.println(saioa.saioakAtera());
    	
    }
}
