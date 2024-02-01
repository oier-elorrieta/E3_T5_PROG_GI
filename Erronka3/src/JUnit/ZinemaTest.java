package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Zinema;

public class ZinemaTest {

    @Test
    public void testEquals() {
        Zinema zinema1 = new Zinema(1, "Zinema1", "Helbidea1");
        Zinema zinema2 = new Zinema(1, "Zinema1", "Helbidea1");
        Zinema zinema3 = new Zinema(2, "Zinema2", "Helbidea2");

        assertTrue(zinema1.equals(zinema2));
        assertFalse(zinema1.equals(zinema3));
    }

    @Test
    public void testHashCode() {
        Zinema zinema1 = new Zinema(1, "Zinema1", "Helbidea1");
        Zinema zinema2 = new Zinema(1, "Zinema1", "Helbidea1");
        Zinema zinema3 = new Zinema(2, "Zinema2", "Helbidea2");

        assertEquals(zinema1.hashCode(), zinema2.hashCode());
        assertNotEquals(zinema1.hashCode(), zinema3.hashCode());
    }

    @Test
    public void testToString() {
        Zinema zinema = new Zinema(1, "Zinema1", "Helbidea1");
        String expectedString = "Zinema id_zine 1, izena Zinema1, helbidea Helbidea1 ";

        assertEquals(expectedString, zinema.toString());
    }
}

