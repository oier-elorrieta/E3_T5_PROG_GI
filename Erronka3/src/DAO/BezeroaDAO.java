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
        Bezeroa[] bezeroak = null;
>>>>>>> 0a58d5c628c7a3d9cfb5354262ceeed0b485befc
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

<<<<<<< HEAD
            bezeroList = new Bezeroa[count];
=======
            bezeroak = new Bezeroa[count];
>>>>>>> 0a58d5c628c7a3d9cfb5354262ceeed0b485befc

            String sql = "SELECT * FROM BEZEROA";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    int index = 0;
                    while (rs.next()) {
                        int bezeroId = rs.getInt("Bezero_id");
                        String izena = rs.getString("izena");
                        String abizena = rs.getString("abizena");
                        String nan = rs.getString("NAN");
                        String sexua = rs.getString("Generoa");
                        String email = rs.getString("Email");
                        String telefonoa = rs.getString("telefonoa");
                        String erabiltzailea = rs.getString("erabiltzailea");
                        String pasahitza = rs.getString("pasahitza");
                        String jaioData = rs.getString("jaio_data");


                        Bezeroa bezeroa = new Bezeroa(izena, abizena, nan, sexua, pasahitza, erabiltzailea);
<<<<<<< HEAD
                        bezeroList[index] = bezeroa;
=======
                        bezeroak[index] = bezeroa;
>>>>>>> 0a58d5c628c7a3d9cfb5354262ceeed0b485befc
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
        return bezeroak;
    }
}
>>>>>>> 0a58d5c628c7a3d9cfb5354262ceeed0b485befc
