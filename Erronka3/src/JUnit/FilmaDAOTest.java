package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DAO.FilmaDAO;
import Modelo.Filma;

public class FilmaDAOTest {
    private FilmaDAO filmaDAO;

    @Before
    public void setUp() {
        filmaDAO = new FilmaDAO();
    }

    @After
    public void tearDown() {
        
    }

    @Test
    public void testGetAllFilmak() {
        Filma[] filmak = filmaDAO.getAllFilmak();
        
        assertNotNull(filmak);
        
        assert(filmak.length > 0);
        
        for (Filma filma : filmak) {
            assertNotNull(filma.getIzena());
            assert(filma.getId_peli() > 0);
            assert(filma.getIraupena() > 0);
            assertNotNull(filma.getGeneroa());
            assert(filma.getPrezioa() > 0);
        }
    }
}
