package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import Modelo.Saioa;
import Modelo.Areto;
import Modelo.Filma;

public class SaioaDAO {

    private String url = "jdbc:mysql://localhost:3307/db_elorrietazinemaT5";
    private String user = "root";
    private String pass = "";
    
public Saioa[] getAllSaioak() {
        Saioa[] saioaList = null;
        int count = 0;

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            String countSql = "SELECT COUNT(*) AS total FROM SAIOA";
            try (PreparedStatement countPstmt = con.prepareStatement(countSql)) {
                try (ResultSet countRs = countPstmt.executeQuery()) {
                    if (countRs.next()) {
                        count = countRs.getInt("total");
                    }
                }
            }

            saioaList = new Saioa[count];

            String sql = "SELECT * FROM SAIOA";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    int index = 0;
                    while (rs.next()) {
                    
                        LocalDate ordua = rs.getDate("ordua").toLocalDate();
                        LocalDate date = rs.getDate("date").toLocalDate();
                        int filmaId = rs.getInt("filmaId"); 
                        int aretoId = rs.getInt("aretoId"); 
                        Filma filma = getFilmaById(filmaId);
                        Areto areto = getAretoById(aretoId);

                        Saioa saioa = new Saioa(ordua, date, filma, areto);
                        saioaList[index] = saioa;
                        index++;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return saioaList;
    }

    private Filma getFilmaById(int id) {
        Filma filma = null;
        String sql = "SELECT * FROM FILMA WHERE filma_id = ?";
        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                 
                    String izena = rs.getString("izena");
                    int id_peli = rs.getInt("filma_id"); 
                    int iraupena = rs.getInt("iraupena");
                    String generoa = rs.getString("generoa");
                    double prezioa = rs.getDouble("prezioa");

                    filma = new Filma(izena, id_peli, iraupena, generoa, prezioa);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filma;
    }

    private Areto getAretoById(int id) {
        Areto areto = null;
        String sql = "SELECT * FROM ARETOA WHERE aretoa_id = ?";
        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int areto_id = rs.getInt("aretoa_id");
                    String izena = rs.getString("izena");

                    areto = new Areto(areto_id, izena);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return areto;
    }

}

