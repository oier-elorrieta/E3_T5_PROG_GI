package Modelo;

import Vista.Zinemak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import DAO.KonexioaBD;
import DAO.SaioaDAO;
import DAO.ZinemakDAO;

public class Kontsultak {
	private KonexioaBD konexioaBD;
	public Zinemak aukeratuZinema;

public Kontsultak(KonexioaBD konexioaBD) {
	        this.konexioaBD = konexioaBD;
 }	
	
	
public String[] FilmakZinema() {
	    String[] filmakZinema = null;
	    int i = 0;
	    int count = 0;
	    try (Connection con = konexioaBD.getConnection()) {
            String countSql = "SELECT COUNT(*) AS total from filma f join saioa s using(filma_id) where zinema_id = "+ aukeratuZinema;
            try (PreparedStatement sta = con.prepareStatement(countSql)) {
                try (ResultSet res = sta.executeQuery()) {
                    if (res.next()) {
                        count = res.getInt("total");
                    }
                }
            }

            filmakZinema  = new String[count];
	    
	        String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = "+ aukeratuZinema;
	        try (PreparedStatement sta = con.prepareStatement(sql)) {
	            try (ResultSet rs = sta.executeQuery()) {
	                while (rs.next()) {
	                	filmakZinema[i++] = rs.getString("f.izena");
	                }
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        konexioaBD.desconectar(); 
	    }
	    return filmakZinema;
	}
}
