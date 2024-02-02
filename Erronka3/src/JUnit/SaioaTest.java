package JUnit;
import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Saioa;

public class SaioaTest {

    @Test
    public void testGetId_saioa() {
        Saioa saioa = new Saioa(1);
        assertEquals(1, saioa.getId_saioa());
    }

    @Test
    public void testSetId_saioa() {
        Saioa saioa = new Saioa(1);
        saioa.setId_saioa(2);
        assertEquals(2, saioa.getId_saioa());
    }

    @Test
    public void testGetOrdua() {
        Saioa saioa = new Saioa(1);
        saioa.setOrdua(15);
        assertEquals(15, saioa.getOrdua());
    }

    @Test
    public void testSetOrdua() {
        Saioa saioa = new Saioa(1);
        saioa.setOrdua(15);
        assertEquals(15, saioa.getOrdua());
    }

    @Test
    public void testEquals() {
        Saioa saioa1 = new Saioa(1);
        Saioa saioa2 = new Saioa(1);

        assertTrue(saioa1.equals(saioa2));
    }

    @Test
    public void testNotEquals() {
        Saioa saioa1 = new Saioa(1);
        Saioa saioa2 = new Saioa(2);

        assertFalse(saioa1.equals(saioa2));
    }

    @Test
    public void testHashCode() {
        Saioa saioa1 = new Saioa(1);
        Saioa saioa2 = new Saioa(1);

        assertEquals(saioa1.hashCode(), saioa2.hashCode());
    }

    @Test
    public void testToString() {
        Saioa saioa = new Saioa(1);
        saioa.setOrdua(15);

        String expectedToString = "Saioa [id_saioa=1, ordua=15]";
        assertEquals(expectedToString, saioa.toString());
    }
}
