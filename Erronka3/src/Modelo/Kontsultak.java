package Modelo;

import Vista.Zinemak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import DAO.KonexioaBD;
import DAO.SaioaDAO;
import DAO.ZinemakDAO;

public class Kontsultak {
	private KonexioaBD konexioaBD;

public Kontsultak(KonexioaBD konexioaBD) {
	        this.konexioaBD = konexioaBD;
 }	
	
	
public String[] FilmakZinemaZ1() {
	    String[] filmak = new String[100]; // Tamaño del array según necesites
	    int i = 0;
	    try (Connection con = konexioaBD.getConnection()) {
	        String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = 'Z1'";
	        try (PreparedStatement sta = con.prepareStatement(sql)) {
	            try (ResultSet rs = sta.executeQuery()) {
	                while (rs.next()) {
	                    filmak[i++] = rs.getString("f.izena");
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


public void FilmakZinemaZ2() {

      
      try (Connection con = konexioaBD.getConnection()) {
      String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = Z2";
      try (PreparedStatement sta = con.prepareStatement(sql)) {
          try (ResultSet rs = sta.executeQuery()) {
              while (rs.next()) {
           	   String Filmak = rs.getString("f.izena");
           	   
           	   System.out.println(Filmak);
              }
          }
              }
      } catch (SQLException e) {
          e.printStackTrace();
      } finally {
          konexioaBD.desconectar(); 
          }
	
}

public void FilmakZinemaZ3 () {


  
  try (Connection con = konexioaBD.getConnection()) {
  String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = Z3";
  try (PreparedStatement sta = con.prepareStatement(sql)) {
      try (ResultSet rs = sta.executeQuery()) {
          while (rs.next()) {
       	   String Filmak = rs.getString("f.izena");
       	   
       	   System.out.println(Filmak);
          }
      }
          }
  } catch (SQLException e) {
      e.printStackTrace();
  } finally {
      konexioaBD.desconectar(); 
      }
}
public void FilmakZinemaZ4 () {
  
  try (Connection con = konexioaBD.getConnection()) {
  String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = Z4";
  try (PreparedStatement sta = con.prepareStatement(sql)) {
      try (ResultSet rs = sta.executeQuery()) {
          while (rs.next()) {
       	   String Filmak = rs.getString("f.izena");
       	   
       	   System.out.println(Filmak);
          }
      }
          }
  } catch (SQLException e) {
      e.printStackTrace();
  } finally {
      konexioaBD.desconectar(); 
      }
}

public void FilmakZinemaZ5 () {
  
  try (Connection con = konexioaBD.getConnection()) {
  String sql = "SELECT f.izena from filma f join saioa s using(filma_id) where zinema_id = Z5";
  try (PreparedStatement sta = con.prepareStatement(sql)) {
      try (ResultSet rs = sta.executeQuery()) {
          while (rs.next()) {
       	   String Filmak = rs.getString("f.izena");
       	   
       	   System.out.println(Filmak);
          }
      }
          }
  } catch (SQLException e) {
      e.printStackTrace();
  } finally {
      konexioaBD.desconectar(); 
      }
}

}

