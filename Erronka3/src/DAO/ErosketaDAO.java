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

    public int azkenErosketaIdLortu() {
        int id = 0;
        try (Connection con = konexioaBD.getConnection();
             PreparedStatement pstmt = con.prepareStatement("SELECT erosketak_id FROM EROSKETAK ORDER BY erosketak_id DESC LIMIT 1");
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                id = rs.getInt("erosketak_id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id + 1; 
    }

    public boolean insertErosketa(Erosketa erosketa) {
        boolean inserted = false;
        try (Connection con = konexioaBD.getConnection();
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO EROSKETAK (dirutotala, erosketak_id, jatorria, Bezero_id, Deskontua) VALUES (?, ?, ?, ?, ?)")) {
            pstmt.setDouble(1, erosketa.getDiruTotala());
            pstmt.setInt(2, azkenErosketaIdLortu());
            pstmt.setString(3, "fisikoa");
            pstmt.setInt(4, erosketa.getBezeroa().getBezero_id());
            pstmt.setDouble(5, 30);

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                inserted = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();           
        }
        return inserted;
    }

    public Erosketa azkenErosketaLortu() {
        Erosketa erosketa = null;
        try (Connection con = konexioaBD.getConnection();
             PreparedStatement pstmt = con.prepareStatement("SELECT erosketak_id FROM EROSKETAK ORDER BY erosketak_id DESC LIMIT 1");
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                int erosketa_id = rs.getInt("erosketak_id");
                Sarrera[] sarrera = null;
                Bezeroa bezero = null;
                erosketa = new Erosketa(sarrera, 0, bezero, erosketa_id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return erosketa;
    }
}
