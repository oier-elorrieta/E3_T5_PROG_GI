package JUnit;
import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Areto;

public class AretoTest {

    @Test
    public void testId_areto() {
        Areto areto = new Areto(1, "A1", 101);
        assertEquals(1, areto.getId_areto());
    }

    @Test
    public void testSetId_areto() {
        Areto areto = new Areto(1, "A1", 101);
        areto.setId_areto(2);
        assertEquals(2, areto.getId_areto());
    }

    @Test
    public void testIzena() {
        Areto areto = new Areto(1, "A1", 101);
        assertEquals("A1", areto.getIzena());
    }

    @Test
    public void testSetIzena() {
        Areto areto = new Areto(1, "A1", 101);
        areto.setIzena("A2");
        assertEquals("A2", areto.getIzena());
    }

    @Test
    public void testZinema_id() {
        Areto areto = new Areto(1, "A1", 101);
        assertEquals(101, areto.getZinema_id());
    }

    @Test
    public void testSetZinema_id() {
        Areto areto = new Areto(1, "A1", 101);
        areto.setZinema_id(102);
        assertEquals(102, areto.getZinema_id());
    }

    @Test
    public void testEquals() {
        Areto areto1 = new Areto(1, "A1", 101);
        Areto areto2 = new Areto(1, "A1", 101);

        assertTrue(areto1.equals(areto2));
    }

    @Test
    public void testNotEquals() {
        Areto areto1 = new Areto(1, "A1", 101);
        Areto areto2 = new Areto(2, "A2", 102);

        assertFalse(areto1.equals(areto2));
    }

    @Test
    public void testHashCode() {
        Areto areto1 = new Areto(1, "A1", 101);
        Areto areto2 = new Areto(1, "A1", 101);

        assertEquals(areto1.hashCode(), areto2.hashCode());
    }

    @Test
    public void testToString() {
        Areto areto = new Areto(1, "A1", 101);

        String expectedToString = "Areto id_areto1, izenaA1, zinema_id101";
        assertEquals(expectedToString, areto.toString());
    }
}
