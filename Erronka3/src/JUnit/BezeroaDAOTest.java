package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DAO.BezeroaDAO;
import Modelo.Bezeroa;

public class BezeroaDAOTest {
    private BezeroaDAO bezeroaDAO;

    @Before
    public void setUp() {
        bezeroaDAO = new BezeroaDAO();
    }

    @After
    public void tearDown() {
        
    }

    @Test
    public void testGetAllBezeroak() {
        Bezeroa[] bezeroak = bezeroaDAO.getAllBezeroak();
        
        assertNotNull(bezeroak);
        
        assert(bezeroak.length > 0);
        
        for (Bezeroa bezeroa : bezeroak) {
            assertNotNull(bezeroa.getIzena());
            assertNotNull(bezeroa.getAbizena());
            assertNotNull(bezeroa.getNan());
            assertNotNull(bezeroa.getSexua());
            assertNotNull(bezeroa.getErabiltzailea());
            assertNotNull(bezeroa.getPasahitza());
        }
    }
}
