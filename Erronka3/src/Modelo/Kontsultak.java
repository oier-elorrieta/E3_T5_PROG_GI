package Modelo;

import Vista.Zinemak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.KonexioaBD;
import DAO.SaioaDAO;
import DAO.ZinemakDAO;

public class Kontsultak {
	private KonexioaBD konexioaBD;


public String[] FilmakZinemaZ1() {
	String[] FilmakZ1 = null;

	int count = 0;

	  try (Connection con = konexioaBD.getConnection()) {
			String countSql = "SELECT COUNT(*) AS total FROM filma f join saioa s using(filma_id) where zinema_id = Z1";
          try (PreparedStatement countPstmt = con.prepareStatement(countSql)) {
              try (ResultSet countRs = countPstmt.executeQuery()) {
                  if (countRs.next()) {
                      count = countRs.getInt("total");
                  }
              }
          }
        FilmakZ1 = new String[count];
       
       String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = Z1";
       try (PreparedStatement sta = con.prepareStatement(sql)) {
           sta.setString(1, "zinema_id");
           try (ResultSet rs = sta.executeQuery()) {
               int i = 0;
               while (rs.next() && i < FilmakZ1.length) {
                   String filmIzena = rs.getString("izena");
                   FilmakZ1[i++] = filmIzena;
               }
           }
               }
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
    	   if (konexioaBD != null) {
           konexioaBD.desconectar(); 
           }
    	   }
    
    return FilmakZ1;
}

public String[] FilmakZinemaZ2() {
	String[] FilmakZ2 = null;
	String countSql = "SELECT COUNT(*) AS total FROM filma f join saioa s using(filma_id) where zinema_id = Z2";
	int count = 0;

    try (Connection con = konexioaBD.getConnection()) {
        try (PreparedStatement sta = con.prepareStatement(countSql)) {
            try (ResultSet res = sta.executeQuery()) {
                if (res.next()) {
                    count = res.getInt("total");
                }
            }
        }
        
        FilmakZ2 = new String[count];
       
       String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = Z2";
       try (PreparedStatement sta = con.prepareStatement(sql)) {
           sta.setString(1, "zinema_id");
           try (ResultSet rs = sta.executeQuery()) {
               int i = 0;
               while (rs.next() && i < FilmakZ2.length) {
                   String filmIzena = rs.getString("izena");
                   FilmakZ2[i++] = filmIzena;
               }
           }
               }
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           konexioaBD.desconectar(); 
           }
    
    return FilmakZ2;
}


public String[] FilmakZinemaZ3 () {
	String[] FilmakZ3 = null;
	String countSql = "SELECT COUNT(*) AS total FROM filma f join saioa s using(filma_id) where zinema_id = Z3";
	int count = 0;

    try (Connection con = konexioaBD.getConnection()) {
        try (PreparedStatement sta = con.prepareStatement(countSql)) {
            try (ResultSet res = sta.executeQuery()) {
                if (res.next()) {
                    count = res.getInt("total");
                }
            }
        }
        
        FilmakZ3 = new String[count];
       
       String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = Z3";
       try (PreparedStatement sta = con.prepareStatement(sql)) {
           sta.setString(1, "zinema_id");
           try (ResultSet rs = sta.executeQuery()) {
               int i = 0;
               while (rs.next() && i < FilmakZ3.length) {
                   String filmIzena = rs.getString("izena");
                   FilmakZ3[i++] = filmIzena;
               }
           }
               }
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           konexioaBD.desconectar(); 
           }
    
    return FilmakZ3;
}

public String[] FilmakZinemaZ4 () {
	String[] FilmakZ4 = null;
	String countSql = "SELECT COUNT(*) AS total FROM filma f join saioa s using(filma_id) where zinema_id = Z4";
	int count = 0;

    try (Connection con = konexioaBD.getConnection()) {
        try (PreparedStatement sta = con.prepareStatement(countSql)) {
            try (ResultSet res = sta.executeQuery()) {
                if (res.next()) {
                    count = res.getInt("total");
                }
            }
        }
        
        FilmakZ4 = new String[count];
       
       String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = Z4";
       try (PreparedStatement sta = con.prepareStatement(sql)) {
           sta.setString(1, "zinema_id");
           try (ResultSet rs = sta.executeQuery()) {
               int i = 0;
               while (rs.next() && i < FilmakZ4.length) {
                   String filmIzena = rs.getString("izena");
                   FilmakZ4[i++] = filmIzena;
               }
           }
               }
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           konexioaBD.desconectar(); 
           }
    
    return FilmakZ4;
}


public String[] FilmakZinemaZ5 () {
	String[] FilmakZ5 = null;
	String countSql = "SELECT COUNT(*) AS total FROM filma f join saioa s using(filma_id) where zinema_id = Z5";
	int count = 0;

    try (Connection con = konexioaBD.getConnection()) {
        try (PreparedStatement sta = con.prepareStatement(countSql)) {
            try (ResultSet res = sta.executeQuery()) {
                if (res.next()) {
                    count = res.getInt("total");
                }
            }
        }
        
        FilmakZ5 = new String[count];
       
       String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = Z5";
       try (PreparedStatement sta = con.prepareStatement(sql)) {
           sta.setString(1, "zinema_id");
           try (ResultSet rs = sta.executeQuery()) {
               int i = 0;
               while (rs.next() && i < FilmakZ5.length) {
                   String filmIzena = rs.getString("izena");
                   FilmakZ5[i++] = filmIzena;
               }
           }
               }
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
           konexioaBD.desconectar(); 
           }
    
    return FilmakZ5;
}




}

