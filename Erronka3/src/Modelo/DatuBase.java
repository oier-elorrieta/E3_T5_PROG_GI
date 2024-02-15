package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.BezeroaDAO;

public class DatuBase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3307/db_elorrietazinemaT5";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            con.close();

            BezeroaDAO bezeroaDAO = new BezeroaDAO();
            Bezeroa[] bezeroList = bezeroaDAO.getAllBezeroak();

            for (Bezeroa bezeroa : bezeroList) {
                System.out.println("Izena: " + bezeroa.getIzena());
                System.out.println("Abizena: " + bezeroa.getAbizena());
                System.out.println("NAN: " + bezeroa.getNan());
                System.out.println("Sexua: " + bezeroa.getSexua());
                System.out.println("Erabiltzailea: " + bezeroa.getErabiltzailea());
                System.out.println("Pasahitza: " + bezeroa.getPasahitza());
                System.out.println("---------------------------------------------");
            }
        

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}