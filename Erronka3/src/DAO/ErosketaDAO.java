package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Modelo.Bezeroa;
import Modelo.Erosketa;
import Modelo.Sarrera;

public class ErosketaDAO {
    private KonexioaBD konexioaBD;

    public ErosketaDAO() {
        konexioaBD = new KonexioaBD();
    }

    public Erosketa azkenErosketaLortu() {
        Erosketa erosketa = null;

        try (Connection con = konexioaBD.getConnection()) {
            String sql = "SELECT erosketak_id FROM EROSKETAK ORDER BY erosketak_id DESC LIMIT 1";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        int erosketa_id = rs.getInt("erosketak_id");
                        Sarrera[] sarrera = null;
                        Bezeroa bezero = null;
                        erosketa = new Erosketa(sarrera, 0, bezero, erosketa_id);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            konexioaBD.desconectar();
        }

        return erosketa;
    }

   
}
