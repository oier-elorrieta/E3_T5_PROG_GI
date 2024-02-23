package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DAO.SaioaDAO;
import Modelo.Saioa;

public class SaioaDAOTest {
    private SaioaDAO saioaDAO;

    @Before
    public void setUp() {
        saioaDAO = new SaioaDAO();
    }

    @After
    public void tearDown() {
        saioaDAO = null;
    }

    @Test
    public void testGetAllSaioak() {
        Saioa[] saioak = saioaDAO.getAllSaioak();
        
        assertNotNull(saioak);
        assertTrue(saioak.length > 0);
        
        for (Saioa saioa : saioak) {
            assertNotNull(saioa.getOrdua());
            assertNotNull(saioa.getDate());
            assertNotNull(saioa.getFilma());
            assertNotNull(saioa.getAretoa());
        }
    }
}
