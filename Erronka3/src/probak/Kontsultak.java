package probak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DAO.AretoDAO;
import DAO.KonexioaBD;
import DAO.SaioaDAO;
import DAO.ZinemakDAO;
import Modelo.Filma;
import Modelo.Saioa;
import Modelo.Zinema;

public class Kontsultak {
    private Zinema aukeratuZinema;
   

    public void setAukeratuZinema(Zinema aukeratuZinema) {
        this.aukeratuZinema = aukeratuZinema;
    }


 

    public String[] FilmakZinema(String selectedZinema) {
        String[] filmakZinema = null;
        int count = 0;
       
            filmakZinema = new String[count];

            
           
            
            Zinema zinema = new Zinema(countSql, countSql, countSql, saioaList, null);
            
            if (selectedZinema != null) {
           saioaList = zinema.getSaioalistArray() ;
            if (saioaList != null) {
            for (Saioa saioa : saioaList) {
                Filma filma = saioa.getFilma();
                if (filma != null) {
                for ( int i = 0;i < filmakZinema.length; i++ ) {
                	filmakZinema[i] = filma.getIzena();                    
                }
            }
        }
           
            }
        return filmakZinema;
}
    }
}
