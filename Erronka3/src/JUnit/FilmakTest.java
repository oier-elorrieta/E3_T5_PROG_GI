package JUnit;

import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.Test;

import Modelo.Filmak;

public class FilmakTest {

    @Test
    public void testGetIzena() {
        Filmak filmak = new Filmak("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals("Film1", filmak.getIzena());
    }

    @Test
    public void testSetIzena() {
        Filmak filmak = new Filmak(null, 0, 0, null, 0);
        filmak.setIzena("Film2");
        assertEquals("Film2", filmak.getIzena());
    }

    @Test
    public void testGetId_peli() {
        Filmak filmak = new Filmak("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals(1, filmak.getId_peli());
    }

    @Test
    public void testSetId_peli() {
        Filmak filmak = new Filmak(null, 0, 0, null, 0);
        filmak.setId_peli(2);
        assertEquals(2, filmak.getId_peli());
    }

    @Test
    public void testGetIraupena() {
        Filmak filmak = new Filmak("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals(120, filmak.getIraupena());
    }

    @Test
    public void testSetIraupena() {
        Filmak filmak = new Filmak(null, 0, 0, null, 0);
        filmak.setIraupena(130);
        assertEquals(130, filmak.getIraupena());
    }

    @Test
    public void testGetGeneroa() {
        Filmak filmak = new Filmak("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals("Generoa1", filmak.getGeneroa());
    }

    @Test
    public void testSetGeneroa() {
        Filmak filmak = new Filmak(null, 0, 0, null, 0);
        filmak.setGeneroa("Generoa2");
        assertEquals("Generoa2", filmak.getGeneroa());
    }

    @Test
    public void testGetPrezioa() {
        Filmak filmak = new Filmak("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals(10.0, filmak.getPrezioa(), 0.01);
    }

    @Test
    public void testSetPrezioa() {
        Filmak filmak = new Filmak(null, 0, 0, null, 0);
        filmak.setPrezioa(15.5);
        assertEquals(15.5, filmak.getPrezioa(), 0.01);
    }

    @Test
    public void testEquals() {
        Filmak filmak1 = new Filmak("Film1", 1, 120, "Generoa1", 10.0);
        Filmak filmak2 = new Filmak("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals(filmak1, filmak2);
    }

    @Test
    public void testToString() {
        Filmak filmak = new Filmak("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals("Pelikula [izena=Film1, id_peli=1, iraupena=120, generoa=Generoa1, prezioa=10.0]", filmak.toString());
    }

    @Test
    public void testHashCode() {
        Filmak filmak = new Filmak("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals(Objects.hash("Film1", 1, 120, "Generoa1", 10.0), filmak.hashCode());
    }
}
