package JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DAO.ErosketaDAO;
import Modelo.Bezeroa;
import Modelo.Erosketa;

public class ErosketaDAOTest {
    private ErosketaDAO erosketaDAO;

    @Before
    public void setUp() {
        erosketaDAO = new ErosketaDAO();
    }


    @Test
    public void testInsertErosketa() {
        Bezeroa bezeroa = new Bezeroa(1, "Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");

        Erosketa erosketa = new Erosketa();
        erosketa.setDiruTotala(100); 
        erosketa.setId_erosketak(100);
        erosketa.setBezeroa(bezeroa); 

        boolean inserted = erosketaDAO.insertErosketa(erosketa);
        assertTrue(inserted);
    }
}
