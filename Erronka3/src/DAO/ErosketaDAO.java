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
         
        }

        return erosketa;
    }
    public boolean insertErosketa(Erosketa erosketa) {
        boolean inserted = false;
        Connection con = null;
        try {
            con = konexioaBD.getConnection();
            String sql = "INSERT INTO EROSKETAK (dirutotala, erosketak_id, jatorria, Bezero_id, Deskontua) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setDouble(1, erosketa.getDiruTotala());
                pstmt.setInt(2, erosketa.getId_erosketak());
                pstmt.setString(3, "fisikoa");
                pstmt.setInt(4, erosketa.getBezeroa().getBezero_id());
                pstmt.setDouble(5, 30);

                int affectedRows = pstmt.executeUpdate();
                if (affectedRows > 0) {
                    inserted = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // No cierres la conexión aquí
        }
        return inserted;
    }
}
