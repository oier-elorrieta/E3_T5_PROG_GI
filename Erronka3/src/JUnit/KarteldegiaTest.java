package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Filmak;
import Modelo.Karteldegia;

public class KarteldegiaTest {

    @Test
    public void testGetFilmak() {
        Filmak[] filmak = {new Filmak("Film1", 1, 120, "Generoa1", 10.0)};
        Karteldegia karteldegia = new Karteldegia(filmak);
        assertArrayEquals(filmak, karteldegia.getFilmak());
    }

    @Test
    public void testSetFilmak() {
        Filmak[] filmak = {new Filmak("Film1", 1, 120, "Generoa1", 10.0)};
        Karteldegia karteldegia = new Karteldegia(filmak);
        karteldegia.setFilmak(filmak);
        assertArrayEquals(filmak, karteldegia.getFilmak());
    }

    @Test
    public void testEquals() {
        Filmak[] filmak1 = {new Filmak("Film1", 1, 120, "Generoa1", 10.0)};
        Filmak[] filmak2 = {new Filmak("Film1", 1, 120, "Generoa1", 10.0)};
        Karteldegia karteldegia1 = new Karteldegia(filmak1);
        Karteldegia karteldegia2 = new Karteldegia(filmak2);
        assertEquals(karteldegia1, karteldegia2);
    }

    @Test
    public void testToString() {
        Filmak[] filmak = {new Filmak("Film1", 1, 120, "Generoa1", 10.0)};
        Karteldegia karteldegia = new Karteldegia(filmak);
        assertEquals("Karteldegia [filmak=[Pelikula [izena=Film1, id_peli=1, iraupena=120, generoa=Generoa1, prezioa=10.0]]]", karteldegia.toString());
    }
}