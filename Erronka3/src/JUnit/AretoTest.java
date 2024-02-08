package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Areto;

public class AretoTest {

    @Test
    public void testGetId_areto() {
        Areto areto = new Areto(1, "A1");
        assertEquals(1, areto.getId_areto());
    }

    @Test
    public void testSetId_areto() {
        Areto areto = new Areto(1, "A1");
        areto.setId_areto(2);
        assertEquals(2, areto.getId_areto());
    }

    @Test
    public void testGetIzena() {
        Areto areto = new Areto(1, "A1");
        assertEquals("A1", areto.getIzena());
    }

    @Test
    public void testSetIzena() {
        Areto areto = new Areto(1, "A1");
        areto.setIzena("A2");
        assertEquals("A2", areto.getIzena());
    }

    @Test
    public void testToString() {
        Areto areto = new Areto(1, "A1");
        assertEquals("Areto [id_areto=1, izena=A1]", areto.toString());
    }

    @Test
    public void testHashCode() {
        Areto areto1 = new Areto(1, "A1");
        Areto areto2 = new Areto(1, "A1");
        assertEquals(areto1.hashCode(), areto2.hashCode());
    }

    @Test
    public void testEquals() {
        Areto areto1 = new Areto(1, "A1");
        Areto areto2 = new Areto(1, "A1");
        Areto areto3 = new Areto(2, "A2");

        assertEquals(areto1, areto2);
        assertNotEquals(areto1, areto3);
        assertNotEquals(areto2, areto3);
        assertNotEquals(areto1, null);
        assertNotEquals(areto1, "A1");
    }
}
