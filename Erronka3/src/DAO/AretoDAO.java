package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Modelo.Areto;

public class AretoDAO {

private String url = "jdbc:mysql://localhost:3307/db_elorrietazinemaT5";
private String user = "root";
private String pass = "";

public Areto[] getAllAretoak() {

	Areto[] listaAreto = null;
    

    int count = 0;

    try (Connection con = DriverManager.getConnection(url, user, pass)) {
        String sql = "SELECT COUNT(*) AS total FROM aretoa";
        try (PreparedStatement sta = con.prepareStatement(sql)) {
            try (ResultSet res = sta.executeQuery()) {
                if (res.next()) {
                    count = res.getInt("total");
                }
            }
        }

        listaAreto = new Areto[count];
        

        String kontsulta = "SELECT * FROM Aretoa";
        try (PreparedStatement pstmt = con.prepareStatement(kontsulta)) {
            try (ResultSet rs = pstmt.executeQuery()) {
                int index = 0;
                while (rs.next()) {
                    int id_areto = rs.getInt("aretoa_id");
                    String izena = rs.getString("izena");
                    
                    

                    Areto areto = new Areto(id_areto,izena);

                    listaAreto[index] = areto;
                    
            

                    index++;
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return listaAreto;


 
}
}
