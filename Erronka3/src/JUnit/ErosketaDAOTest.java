package JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import DAO.ErosketaDAO;
import Modelo.Bezeroa;
import Modelo.Erosketa;
import Modelo.Sarrera;

public class ErosketaDAOTest {
    private ErosketaDAO erosketaDAO;

    @Before
    public void setUp() {
        erosketaDAO = new ErosketaDAO();
    }

    @Test
    public void testAzkenErosketaIdLortu() {
        int lastId = erosketaDAO.azkenErosketaIdLortu();
        assertTrue(lastId > 0); 
    }

    @Test
    public void testInsertErosketa() {      
        Erosketa erosketa = new Erosketa(null, 100.0, null, 0); 
        boolean inserted = erosketaDAO.insertErosketa(erosketa);
        assertTrue(inserted);
    }

    @Test
    public void testAzkenErosketaLortu() {
        Erosketa erosketa = erosketaDAO.azkenErosketaLortu();
        assertNotNull(erosketa); 
        assertTrue(erosketa.getId_erosketak() > 0); 
    }
}
