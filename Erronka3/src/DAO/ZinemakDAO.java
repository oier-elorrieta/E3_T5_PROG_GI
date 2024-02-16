package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Modelo.Zinema;

public class ZinemakDAO {

private String url = "jdbc:mysql://localhost:3307/db_elorrietazinemaT5";
private String user = "root";
private String pass = "";

public Zinema[] getAllZinemak() {

	Zinema[] ListaZinema = null;
    

    int count = 0;

    try (Connection con = DriverManager.getConnection(url, user, pass)) {
        String sql = "SELECT COUNT(*) AS total FROM ZINEMA";
        try (PreparedStatement sta = con.prepareStatement(sql)) {
            try (ResultSet res = sta.executeQuery()) {
                if (res.next()) {
                    count = res.getInt("total");
                }
            }
        }

        ListaZinema = new Zinema[count];
        

        String kontsulta = "SELECT * FROM BEZEROA";
        try (PreparedStatement pstmt = con.prepareStatement(kontsulta)) {
            try (ResultSet rs = pstmt.executeQuery()) {
                int index = 0;
                while (rs.next()) {
                    int id_zine = rs.getInt("zinema_id");
                    String izena = rs.getString("izena");
                    String helbidea = rs.getString("helbidea");
                    
                    

                    Zinema zinema = new Zinema(id_zine,izena,helbidea,null ,null);

                    ListaZinema[index] = zinema;
                    
            

                    index++;
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return ListaZinema;


 
}
}
