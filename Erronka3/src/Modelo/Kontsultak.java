package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DAO.AretoDAO;
import DAO.KonexioaBD;
import DAO.SaioaDAO;
import DAO.ZinemakDAO;

public class Kontsultak {
    private Zinema aukeratuZinema;
   

    public void setAukeratuZinema(Zinema aukeratuZinema) {
        this.aukeratuZinema = aukeratuZinema;
    }


 

    public String[] FilmakZinema(String selectedZinema) {
        String[] filmakZinema = null;
        int count = 0;
        KonexioaBD konexioaBD = new KonexioaBD();
        try (Connection con = konexioaBD.getConnection()) {
            String countSql = "SELECT COUNT(*) AS total FROM filma f JOIN saioa s ON f.filma_id = s.filma_id WHERE s.zinema_id = ?";
            try (PreparedStatement sta = con.prepareStatement(countSql)) {
                sta.setString(1, selectedZinema);
                try (ResultSet res = sta.executeQuery()) {
                    if (res.next()) {
                        count = res.getInt("total");
                    }
                }
            }

            filmakZinema = new String[count];

            
            SaioaDAO saioaDAO = new SaioaDAO();
            Saioa[] saioaList = saioaDAO.getAllSaioak();
            
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
        }
            
      
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	if (konexioaBD != null){
            konexioaBD.desconectar();
        	}
        }
        return filmakZinema;
}
}
