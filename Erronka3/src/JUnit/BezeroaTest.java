package JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Modelo.Bezeroa;

public class BezeroaTest {

    @Test
    public void testConstructorAndGetters() {
        Bezeroa bezero = new Bezeroa("John Doe", "john.doe", "123456789", 'M', "john.doe@example.com", "password");

        assertEquals("John Doe", bezero.getIzena());
        assertEquals("john.doe", bezero.getErabiltzailea());
        assertEquals("123456789", bezero.getNan());
        assertEquals('M', bezero.getSexua());
        assertEquals("john.doe@example.com", bezero.getEmail());
        assertEquals("password", bezero.getPasahitza());
    }

    @Test
    public void testSetters() {
        Bezeroa bezero = new Bezeroa("John Doe", "john.doe", "123456789", 'M', "john.doe@example.com", "password");

        bezero.setIzena("Jane Doe");
        bezero.setErabiltzailea("jane.doe");
        bezero.setNan("987654321");
        bezero.setSexua('F');
        bezero.setEmail("jane.doe@example.com");
        bezero.setPasahitza("newpassword");

        assertEquals("Jane Doe", bezero.getIzena());
        assertEquals("jane.doe", bezero.getErabiltzailea());
        assertEquals("987654321", bezero.getNan());
        assertEquals('F', bezero.getSexua());
        assertEquals("jane.doe@example.com", bezero.getEmail());
        assertEquals("newpassword", bezero.getPasahitza());
    }

    @Test
    public void testEquals() {
        Bezeroa bezero1 = new Bezeroa("John Doe", "john.doe", "123456789", 'M', "john.doe@example.com", "password");
        Bezeroa bezero2 = new Bezeroa("John Doe", "john.doe", "123456789", 'M', "john.doe@example.com", "password");
        Bezeroa bezero3 = new Bezeroa("Jane Doe", "jane.doe", "987654321", 'F', "jane.doe@example.com", "newpassword");

        assertTrue(bezero1.equals(bezero2));
        assertFalse(bezero1.equals(bezero3));
    }

    @Test
    public void testHashCode() {
        Bezeroa bezero1 = new Bezeroa("John Doe", "john.doe", "123456789", 'M', "john.doe@example.com", "password");
        Bezeroa bezero2 = new Bezeroa("John Doe", "john.doe", "123456789", 'M', "john.doe@example.com", "password");
        Bezeroa bezero3 = new Bezeroa("Jane Doe", "jane.doe", "987654321", 'F', "jane.doe@example.com", "newpassword");

        assertEquals(bezero1.hashCode(), bezero2.hashCode());
        assertNotEquals(bezero1.hashCode(), bezero3.hashCode());
    }
}