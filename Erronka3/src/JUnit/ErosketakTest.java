package JUnit;
import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Erosketak;

public class ErosketakTest {

    @Test
    public void testDiruTotala() {
        Erosketak erosketak = new Erosketak();
        erosketak.setDiruTotala(100);
        assertEquals(100, erosketak.getDiruTotala());
    }

    @Test
    public void testSetDiruTotala() {
        Erosketak erosketak = new Erosketak();
        erosketak.setDiruTotala(200);
        assertEquals(200, erosketak.getDiruTotala());
    }

    @Test
    public void testKantitatea() {
        Erosketak erosketak = new Erosketak();
        erosketak.setKantitatea(5);
        assertEquals(5, erosketak.getKantitatea());
    }

    @Test
    public void testSetKantitatea() {
        Erosketak erosketak = new Erosketak();
        erosketak.setKantitatea(10);
        assertEquals(10, erosketak.getKantitatea());
    }

    @Test
    public void testId_erosketak() {
        Erosketak erosketak = new Erosketak();
        erosketak.setId_erosketak(1);
        assertEquals(1, erosketak.getId_erosketak());
    }

    @Test
    public void testSetId_erosketak() {
        Erosketak erosketak = new Erosketak();
        erosketak.setId_erosketak(2);
        assertEquals(2, erosketak.getId_erosketak());
    }

    @Test
    public void testId_bezeroa() {
        Erosketak erosketak = new Erosketak();
        erosketak.setId_bezeroa(1001);
        assertEquals(1001, erosketak.getId_bezeroa());
    }

    @Test
    public void testSetId_bezeroa() {
        Erosketak erosketak = new Erosketak();
        erosketak.setId_bezeroa(2002);
        assertEquals(2002, erosketak.getId_bezeroa());
    }

    @Test
    public void testEquals() {
        Erosketak erosketak1 = new Erosketak();
        erosketak1.setDiruTotala(100);
        erosketak1.setKantitatea(5);
        erosketak1.setId_erosketak(1);
        erosketak1.setId_bezeroa(1001);

        Erosketak erosketak2 = new Erosketak();
        erosketak2.setDiruTotala(100);
        erosketak2.setKantitatea(5);
        erosketak2.setId_erosketak(1);
        erosketak2.setId_bezeroa(1001);

        assertTrue(erosketak1.equals(erosketak2));
    }

    @Test
    public void testNotEquals() {
        Erosketak erosketak1 = new Erosketak();
        erosketak1.setDiruTotala(100);
        erosketak1.setKantitatea(5);
        erosketak1.setId_erosketak(1);
        erosketak1.setId_bezeroa(1001);

        Erosketak erosketak2 = new Erosketak();
        erosketak2.setDiruTotala(200);
        erosketak2.setKantitatea(10);
        erosketak2.setId_erosketak(2);
        erosketak2.setId_bezeroa(2002);

        assertFalse(erosketak1.equals(erosketak2));
    }

    @Test
    public void testHashCode() {
        Erosketak erosketak1 = new Erosketak();
        erosketak1.setDiruTotala(100);
        erosketak1.setKantitatea(5);
        erosketak1.setId_erosketak(1);
        erosketak1.setId_bezeroa(1001);

        Erosketak erosketak2 = new Erosketak();
        erosketak2.setDiruTotala(100);
        erosketak2.setKantitatea(5);
        erosketak2.setId_erosketak(1);
        erosketak2.setId_bezeroa(1001);

        assertEquals(erosketak1.hashCode(), erosketak2.hashCode());
    }

    @Test
    public void testToString() {
        Erosketak erosketak = new Erosketak();
        erosketak.setDiruTotala(100);
        erosketak.setKantitatea(5);
        erosketak.setId_erosketak(1);
        erosketak.setId_bezeroa(1001);

        String expectedToString = "Erosketak diruTotala100, kantitatea5, id_erosketak1, id_bezeroa1001";
        assertEquals(expectedToString, erosketak.toString());
    }
}
