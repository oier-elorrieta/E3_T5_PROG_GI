package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Modelo.Bezeroa;
import Modelo.Erosketa;

public class ErosketaDAO {
    private KonexioaBD konexioaBD;

    public ErosketaDAO() {
        konexioaBD = new KonexioaBD();
    }

    public boolean insertErosketa(Erosketa erosketa) {
        boolean inserted = false;

        try (Connection con = konexioaBD.getConnection()) {
            String sql = "INSERT INTO EROSKETAK (dirutotala, erosketak_id, jatorria, Bezero_id, Deskontua) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setDouble(1, erosketa.getDiruTotala());
                pstmt.setInt(2, erosketa.getId_erosketak());
                // Asumiendo que el origen de la compra (jatorria) se establece externamente
                pstmt.setString(3, "fisikoa");//modua
                pstmt.setInt(4, erosketa.getBezeroa().getBezero_id());
                pstmt.setDouble(5, 30);//descontua

                int affectedRows = pstmt.executeUpdate();
                if (affectedRows > 0) {
                    inserted = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            konexioaBD.desconectar();
        }

        return inserted;
    }
}
