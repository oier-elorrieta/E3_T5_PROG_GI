package JUnit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import Modelo.Saioa;
import Modelo.Sarrera;

public class SarreraTest {

    @Test
    public void testGetMota() {
        Saioa[] saioak = new Saioa[5];
        Sarrera sarrera = new Sarrera("mota", saioak);
        assertEquals("mota", sarrera.getMota());
    }

    @Test
    public void testSetMota() {
        Saioa[] saioak = new Saioa[5];
        Sarrera sarrera = new Sarrera("mota", saioak);
        sarrera.setMota("newMota");
        assertEquals("newMota", sarrera.getMota());
    }

    @Test
    public void testGetSaioalistArray() {
        Saioa[] saioak = new Saioa[5];
        Sarrera sarrera = new Sarrera("mota", saioak);
        assertArrayEquals(saioak, sarrera.getSaioalistArray());
    }

    @Test
    public void testSetSaioalistArray() {
        Saioa[] saioak = new Saioa[5];
        Sarrera sarrera = new Sarrera("mota", saioak);
        Saioa[] newSaioak = new Saioa[3];
        sarrera.setSaioalistArray(newSaioak);
        assertArrayEquals(newSaioak, sarrera.getSaioalistArray());
    }

    @Test
    public void testEquals() {
        Saioa[] saioak1 = new Saioa[5];
        Saioa[] saioak2 = new Saioa[5];
        Sarrera sarrera1 = new Sarrera("mota", saioak1);
        Sarrera sarrera2 = new Sarrera("mota", saioak2);
        assertTrue(sarrera1.equals(sarrera2));
    }

    @Test
    public void testToString() {
        Saioa[] saioak = new Saioa[5];
        Sarrera sarrera = new Sarrera("mota", saioak);
        String expectedString = "Sarrera [mota=mota, SaioalistArray=" + Arrays.toString(saioak) + "]";
        assertEquals(expectedString, sarrera.toString());
    }
}
