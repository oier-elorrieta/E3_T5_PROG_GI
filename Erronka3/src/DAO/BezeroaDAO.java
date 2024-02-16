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
<<<<<<< HEAD
        

        Bezeroa[] bezeroList = null;



=======
        Bezeroa[] bezeroList = null;
>>>>>>> 441dd3a9d562def824d8d2d0e686383e73b4aeaf
        int count = 0;

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            String countSql = "SELECT COUNT(*) AS total FROM BEZEROA";
            try (PreparedStatement countPstmt = con.prepareStatement(countSql)) {
                try (ResultSet countRs = countPstmt.executeQuery()) {
                    if (countRs.next()) {
                        count = countRs.getInt("total");
                    }
                }
            }

            bezeroList = new Bezeroa[count];

<<<<<<< HEAD



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

       

=======
            String sql = "SELECT * FROM BEZEROA";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    int index = 0;
                    while (rs.next()) {

                        String izena = rs.getString("izena");
                        String abizena = rs.getString("abizena");
                        String nan = rs.getString("NAN");
                        String sexua = rs.getString("Generoa");
                        String erabiltzailea = rs.getString("erabiltzailea");
                        String pasahitza = rs.getString("pasahitza");



                        Bezeroa bezeroa = new Bezeroa(izena, abizena, nan, sexua, pasahitza, erabiltzailea);
                        bezeroList[index] = bezeroa;
>>>>>>> 441dd3a9d562def824d8d2d0e686383e73b4aeaf
                        index++;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

<<<<<<< HEAD
 

        return bezeroList;
 
    }
}

 
=======
        return bezeroList;
    }
}
>>>>>>> 441dd3a9d562def824d8d2d0e686383e73b4aeaf
