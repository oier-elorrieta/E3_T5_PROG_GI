package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DAO.ZinemakDAO;
import Modelo.Zinema;

public class ZinemakDAOTest {
    private ZinemakDAO zinemakDAO;

    @Before
    public void setUp() {
        zinemakDAO = new ZinemakDAO();
    }

    @After
    public void tearDown() {
        zinemakDAO = null;
    }

    @Test
    public void testGetAllZinemak() {
        Zinema[] zinemak = zinemakDAO.getAllZinemak();
        
        assertNotNull(zinemak);
        assertTrue(zinemak.length > 0);
        
        for (Zinema zinema : zinemak) {
            assertNotNull(zinema.getId_zine());
            assertNotNull(zinema.getIzena());
        }
    }
}
