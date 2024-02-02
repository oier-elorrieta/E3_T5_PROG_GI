package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;
import Modelo.Sarrera;

public class SarreraTest {

    @Test
    public void testGetId_sarrera() {
        Sarrera sarrera = new Sarrera();
        sarrera.setId_sarrera(1);
        assertEquals(1, sarrera.getId_sarrera());
    }

    @Test
    public void testSetId_sarrera() {
        Sarrera sarrera = new Sarrera();
        sarrera.setId_sarrera(1);
        assertEquals(1, sarrera.getId_sarrera());
    }

    @Test
    public void testGetId_erosketak() {
        Sarrera sarrera = new Sarrera();
        sarrera.setId_erosketak(2);
        assertEquals(2, sarrera.getId_erosketak());
    }

    @Test
    public void testSetId_erosketak() {
        Sarrera sarrera = new Sarrera();
        sarrera.setId_erosketak(2);
        assertEquals(2, sarrera.getId_erosketak());
    }

    @Test
    public void testGetId_saioa() {
        Sarrera sarrera = new Sarrera();
        sarrera.setId_saioa(3);
        assertEquals(3, sarrera.getId_saioa());
    }

    @Test
    public void testSetId_saioa() {
        Sarrera sarrera = new Sarrera();
        sarrera.setId_saioa(3);
        assertEquals(3, sarrera.getId_saioa());
    }

    @Test
    public void testEquals() {
        Sarrera sarrera1 = new Sarrera();
        sarrera1.setId_sarrera(1);
        sarrera1.setId_erosketak(2);
        sarrera1.setId_saioa(3);

        Sarrera sarrera2 = new Sarrera();
        sarrera2.setId_sarrera(1);
        sarrera2.setId_erosketak(2);
        sarrera2.setId_saioa(3);

        assertTrue(sarrera1.equals(sarrera2));
    }

    @Test
    public void testNotEquals() {
        Sarrera sarrera1 = new Sarrera();
        sarrera1.setId_sarrera(1);
        sarrera1.setId_erosketak(2);
        sarrera1.setId_saioa(3);

        Sarrera sarrera2 = new Sarrera();
        sarrera2.setId_sarrera(4);
        sarrera2.setId_erosketak(5);
        sarrera2.setId_saioa(6);

        assertFalse(sarrera1.equals(sarrera2));
    }

    @Test
    public void testHashCode() {
        Sarrera sarrera1 = new Sarrera();
        sarrera1.setId_sarrera(1);
        sarrera1.setId_erosketak(2);
        sarrera1.setId_saioa(3);

        Sarrera sarrera2 = new Sarrera();
        sarrera2.setId_sarrera(1);
        sarrera2.setId_erosketak(2);
        sarrera2.setId_saioa(3);

        assertEquals(sarrera1.hashCode(), sarrera2.hashCode());
    }

    @Test
    public void testToString() {
        Sarrera sarrera = new Sarrera();
        sarrera.setId_sarrera(1);
        sarrera.setId_erosketak(2);
        sarrera.setId_saioa(3);

        String expectedToString = "Sarrera [id_sarrera=1, id_erosketak=2, id_saioa=3]";
        assertEquals(expectedToString, sarrera.toString());
    }
}
