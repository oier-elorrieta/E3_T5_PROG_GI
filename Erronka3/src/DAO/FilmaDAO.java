package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Modelo.Filma;
import Modelo.Karteldegia;

public class FilmaDAO {
    private KonexioaBD konexioaBD;

    public FilmaDAO() {
        konexioaBD = new KonexioaBD();
    }

    public Filma[] getAllFilmak() {
        Filma[] filmak = null;
        int count = 0;

        try (Connection con = konexioaBD.getConnection()) {
            String countSql = "SELECT COUNT(*) AS total FROM FILMA";
            try (PreparedStatement countStmt = con.prepareStatement(countSql)) {
                try (ResultSet countRs = countStmt.executeQuery()) {
                    if (countRs.next()) {
                        count = countRs.getInt("total");
                    }
                }
            }

            filmak = new Filma[count];
            String sql = "SELECT * FROM FILMA";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    int index = 0;
                    while (rs.next()) {
                        String izena = rs.getString("izena");
                        int id_peli = rs.getInt("filma_id");
                        int iraupena = rs.getInt("iraupena");
                        String generoa = rs.getString("generoa");
                        double prezioa = rs.getDouble("prezioa");

                        Filma filma = new Filma(izena, id_peli, iraupena, generoa, prezioa);
                        filmak[index++] = filma;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            konexioaBD.desconectar();
        }

        return filmak;
    }
}