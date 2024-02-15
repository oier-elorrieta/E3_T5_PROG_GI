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
        Bezeroa[] listaBezeroak = null;
        
=======
        Bezeroa[] bezeroList = null;

        Bezeroa[] bezeroak = null;
>>>>>>> 80b249fc3844014a6d151dd7609e530685b645d3

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

<<<<<<< HEAD
            listaBezeroak = new Bezeroa[count];
            
=======

            bezeroList = new Bezeroa[count];

            bezeroak = new Bezeroa[count];

>>>>>>> 80b249fc3844014a6d151dd7609e530685b645d3

            String kontsulta = "SELECT * FROM BEZEROA";
            try (PreparedStatement pstmt = con.prepareStatement(kontsulta)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    int index = 0;
                    while (rs.next()) {
                        String nombre = rs.getString("izena");
                        String apellido = rs.getString("abizena");
                        String dni = rs.getString("NAN");
                        String genero = rs.getString("Generoa");
                        String email = rs.getString("Email");
                        String telefono = rs.getString("telefonoa");
                        String usuario = rs.getString("erabiltzailea");
                        String contraseña = rs.getString("pasahitza");
                        String fechaNacimiento = rs.getString("jaio_data");

                        Bezeroa bezeroa = new Bezeroa(nombre, apellido, dni, genero, contraseña, usuario);

                        listaBezeroak[index] = bezeroa;
                        
                

<<<<<<< HEAD
=======
                        Bezeroa bezeroa = new Bezeroa(izena, abizena, nan, sexua, pasahitza, erabiltzailea);

                        bezeroList[index] = bezeroa;

                        bezeroak[index] = bezeroa;

>>>>>>> 80b249fc3844014a6d151dd7609e530685b645d3
                        index++;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

<<<<<<< HEAD
        return listaBezeroak;


     
    }
}
=======

        return bezeroList;
    }

}
		

        return bezeroak;
    }
}

>>>>>>> 80b249fc3844014a6d151dd7609e530685b645d3
