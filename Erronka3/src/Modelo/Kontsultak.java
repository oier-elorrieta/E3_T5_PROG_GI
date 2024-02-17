package Modelo;

import Vista.Zinemak;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.KonexioaBD;

public class Kontsultak {
	private KonexioaBD konexioaBD;
	public Zinemak aukeratuZinema;
	public String[] FilmaAukeratu = new String[10];
	
public void KontsultaZinema() {
	
	
	try (Connection con = konexioaBD.getConnection()) {
				String KontsultaZinemak = "select f.izena "
				+ "from filma f join saioa s using(filma_id) join zinema z using (zinema_id)"
				+ "where z.izena = " + aukeratuZinema + "&& s.eguna = 2024-02-17"
				+ "order by ordutegia; ";
        try (PreparedStatement sta = con.prepareStatement(KontsultaZinemak)) {
        	try (ResultSet res = sta.executeQuery()) {
                while (res.next()) {
                	
                	for (int i = 1; i > FilmaAukeratu.length; i++) {
           
                	FilmaAukeratu[i] = res.getString("f.izena");
                
                	System.out.println(FilmaAukeratu[i]);
                	
                	}
                	System.out.println("nsjfcnsi");
            }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	
}

public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}

}

