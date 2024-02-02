package JUnit;
import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Pelikula;

public class PelikulaTest {

    @Test
    public void testGetIzena() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        assertEquals("Inception", pelikula.getIzena());
    }

    @Test
    public void testSetIzena() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        pelikula.setIzena("Interstellar");
        assertEquals("Interstellar", pelikula.getIzena());
    }

    @Test
    public void testGetIdentifikatzailea() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        assertEquals(1, pelikula.getIdentifikatzailea());
    }

    @Test
    public void testSetIdentifikatzailea() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        pelikula.setIdentifikatzailea(2);
        assertEquals(2, pelikula.getIdentifikatzailea());
    }

    @Test
    public void testGetIraupena() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        assertEquals(150, pelikula.getIraupena());
    }

    @Test
    public void testSetIraupena() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        pelikula.setIraupena(180);
        assertEquals(180, pelikula.getIraupena());
    }

    @Test
    public void testGetGeneroa() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        assertEquals("Sci-Fi", pelikula.getGeneroa());
    }

    @Test
    public void testSetGeneroa() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        pelikula.setGeneroa("Action");
        assertEquals("Action", pelikula.getGeneroa());
    }

    @Test
    public void testGetPrezioa() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        assertEquals(9.99, pelikula.getPrezioa(), 0.001);
    }

    @Test
    public void testSetPrezioa() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        pelikula.setPrezioa(12.99);
        assertEquals(12.99, pelikula.getPrezioa(), 0.001);
    }

    @Test
    public void testEquals() {
        Pelikula pelikula1 = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        Pelikula pelikula2 = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);

        assertTrue(pelikula1.equals(pelikula2));
    }

    @Test
    public void testNotEquals() {
        Pelikula pelikula1 = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        Pelikula pelikula2 = new Pelikula("Interstellar", 2, 180, "Sci-Fi", 12.99);

        assertFalse(pelikula1.equals(pelikula2));
    }

    @Test
    public void testHashCode() {
        Pelikula pelikula1 = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);
        Pelikula pelikula2 = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);

        assertEquals(pelikula1.hashCode(), pelikula2.hashCode());
    }

    @Test
    public void testToString() {
        Pelikula pelikula = new Pelikula("Inception", 1, 150, "Sci-Fi", 9.99);

        String expectedToString = "Pelikula izena Inception, identifikatzailea 1, iraupena 150, generoa Sci-Fi, prezioa 9.99 ";
        assertEquals(expectedToString, pelikula.toString());
    }
}
