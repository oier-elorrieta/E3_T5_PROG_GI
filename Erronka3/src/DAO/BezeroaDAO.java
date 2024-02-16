package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Modelo.Bezeroa;

public class BezeroaDAO {
    private String url = "jdbc:mysql://localhost:3307/db_elorrietazinemaT5";
    private String user = "root";
    private String pass = "";

    public Bezeroa[] getAllBezeroak() {
        

        Bezeroa[] bezeroList = null;



        int count = 0;

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            String sql = "SELECT COUNT(*) AS total FROM BEZEROA";
            try (PreparedStatement sta = con.prepareStatement(sql)) {
                try (ResultSet res = sta.executeQuery()) {
                    if (res.next()) {
                        count = res.getInt("total");
                    }
                }
            }

            bezeroList = new Bezeroa[count];




            String kontsulta = "SELECT * FROM BEZEROA";
            try (PreparedStatement pstmt = con.prepareStatement(kontsulta)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    int index = 0;
                    while (rs.next()) {
                        String izena = rs.getString("izena");
                        String abizena = rs.getString("abizena");
                        String NAN = rs.getString("NAN");
                        String Generoa = rs.getString("Generoa");
                        String erabiltzailea = rs.getString("erabiltzailea");
                        String pasahitza = rs.getString("pasahitza");

                        Bezeroa bezeroa = new Bezeroa(izena,abizena,NAN,Generoa,erabiltzailea, pasahitza);

          
                     

                        bezeroList[index] = bezeroa;

       

                        index++;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

 

        return bezeroList;
 
    }
}

 
