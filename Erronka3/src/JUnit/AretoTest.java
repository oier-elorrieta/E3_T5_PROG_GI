package JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Modelo.Areto;

public class AretoTest {

    @Test
    public void testConstructorAndGetters() {
        Areto areto = new Areto(1, "A1", 50);

        assertEquals(1, areto.getId_areto());
        assertEquals("A1", areto.getIzena());
    }

    @Test
    public void testSetters() {
        Areto areto = new Areto(1, "A1", 50);

        areto.setId_areto(2);
        areto.setIzena("A2");

        assertEquals(2, areto.getId_areto());
        assertEquals("A2", areto.getIzena());
    }

    @Test
    public void testEquals() {
        Areto areto1 = new Areto(1, "A1", 50);
        Areto areto2 = new Areto(1, "A1", 50);
        Areto areto3 = new Areto(2, "A2", 60);

        assertTrue(areto1.equals(areto2));
        assertFalse(areto1.equals(areto3));
    }

    @Test
    public void testHashCode() {
        Areto areto1 = new Areto(1, "A1", 50);
        Areto areto2 = new Areto(1, "A1", 50);
        Areto areto3 = new Areto(2, "A2", 60);

        assertEquals(areto1.hashCode(), areto2.hashCode());
        assertNotEquals(areto1.hashCode(), areto3.hashCode());
    }

    @Test
    public void testToString() {
        Areto areto = new Areto(1, "A1", 50);
        String expectedToString = "Areto id_areto 1, izena A1, eserlekuak 50]";

        assertEquals(expectedToString, areto.toString());
    }
}