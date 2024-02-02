package JUnit;
import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Zinema;

public class ZinemaTest {

    @Test
    public void testGetId_zine() {
        Zinema zinema = new Zinema(1, "Zinemaldia", "Bilbao");
        assertEquals(1, zinema.getId_zine());
    }

    @Test
    public void testSetId_zine() {
        Zinema zinema = new Zinema(1, "Zinemaldia", "Bilbao");
        zinema.setId_zine(2);
        assertEquals(2, zinema.getId_zine());
    }

    @Test
    public void testGetIzena() {
        Zinema zinema = new Zinema(1, "Zinemaldia", "Bilbao");
        assertEquals("Zinemaldia", zinema.getIzena());
    }

    @Test
    public void testSetIzena() {
        Zinema zinema = new Zinema(1, "Zinemaldia", "Bilbao");
        zinema.setIzena("Zinefest");
        assertEquals("Zinefest", zinema.getIzena());
    }

    @Test
    public void testGetHelbidea() {
        Zinema zinema = new Zinema(1, "Zinemaldia", "Bilbao");
        assertEquals("Bilbao", zinema.getHelbidea());
    }

    @Test
    public void testSetHelbidea() {
        Zinema zinema = new Zinema(1, "Zinemaldia", "Bilbao");
        zinema.setHelbidea("Donostia");
        assertEquals("Donostia", zinema.getHelbidea());
    }

    @Test
    public void testEquals() {
        Zinema zinema1 = new Zinema(1, "Zinemaldia", "Bilbao");
        Zinema zinema2 = new Zinema(1, "Zinemaldia", "Bilbao");

        assertTrue(zinema1.equals(zinema2));
    }

    @Test
    public void testNotEquals() {
        Zinema zinema1 = new Zinema(1, "Zinemaldia", "Bilbao");
        Zinema zinema2 = new Zinema(2, "Zinefest", "Donostia");

        assertFalse(zinema1.equals(zinema2));
    }

    @Test
    public void testHashCode() {
        Zinema zinema1 = new Zinema(1, "Zinemaldia", "Bilbao");
        Zinema zinema2 = new Zinema(1, "Zinemaldia", "Bilbao");

        assertEquals(zinema1.hashCode(), zinema2.hashCode());
    }

    @Test
    public void testToString() {
        Zinema zinema = new Zinema(1, "Zinemaldia", "Bilbao");

        String expectedToString = "Zinema id_zine 1, izena Zinemaldia, helbidea Bilbao ";
        assertEquals(expectedToString, zinema.toString());
    }
}
