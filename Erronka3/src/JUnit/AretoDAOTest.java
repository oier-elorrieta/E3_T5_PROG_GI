package JUnit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DAO.AretoDAO;
import Modelo.Areto;

public class AretoDAOTest {
    private AretoDAO aretoDAO;

    @Before
    public void setUp() {
        aretoDAO = new AretoDAO();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetAllAretoak() {
        Areto[] aretoak = aretoDAO.getAllAretoak();
        assertNotNull(aretoak);
        assertTrue(aretoak.length > 0);

        for (Areto areto : aretoak) {
            assertNotNull(areto.getId_areto());
            assertNotNull(areto.getIzena());
            assertFalse(areto.getId_areto().isEmpty());
            assertFalse(areto.getIzena().isEmpty());
        }
    }
}
