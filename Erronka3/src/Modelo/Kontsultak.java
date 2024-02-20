package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.KonexioaBD;
import DAO.SaioaDAO;
import DAO.ZinemakDAO;

public class Kontsultak {
    private KonexioaBD konexioaBD;
    
    public Kontsultak(KonexioaBD konexioaBD) {
        this.konexioaBD = konexioaBD;
    }

 

    public String[] FilmakZinema(String selectedZinema) {
        String[] filmakZinema = null;
        int i = 0;
        int count = 0;
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

            String sql = "SELECT DISTINCT f.izena " +
                    "FROM filma f " +
                    "JOIN saioa s ON f.filma_id = s.filma_id " +
                    "WHERE s.zinema_id = ? " +
                    "ORDER BY ABS(DATEDIFF(s.eguna, CURDATE()))";
            try (PreparedStatement sta = con.prepareStatement(sql)) {
                sta.setString(1, selectedZinema);
                try (ResultSet rs = sta.executeQuery()) {
                    while (rs.next()) {
                        filmakZinema[i++] = rs.getString("izena");
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
