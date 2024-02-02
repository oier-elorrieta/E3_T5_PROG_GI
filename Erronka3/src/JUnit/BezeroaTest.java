package JUnit;
import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Bezeroa;

public class BezeroaTest {

    @Test
    public void testGetIzena() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setIzena("Jonan");
        assertEquals("Jonan", bezeroa.getIzena());
    }

    @Test
    public void testSetIzena() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setIzena("Jonan");
        assertEquals("Jonan", bezeroa.getIzena());
    }

    @Test
    public void testGetAbizena() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setAbizena("Apellido");
        assertEquals("Apellido", bezeroa.getAbizena());
    }

    @Test
    public void testSetAbizena() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setAbizena("Apellido");
        assertEquals("Apellido", bezeroa.getAbizena());
    }

    @Test
    public void testGetNan() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setNan("123456789");
        assertEquals("123456789", bezeroa.getNan());
    }

    @Test
    public void testSetNan() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setNan("123456789");
        assertEquals("123456789", bezeroa.getNan());
    }

    @Test
    public void testGetSexua() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setSexua('M');
        assertEquals('M', bezeroa.getSexua());
    }

    @Test
    public void testSetSexua() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setSexua('M');
        assertEquals('M', bezeroa.getSexua());
    }

    @Test
    public void testGetPasahitza() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setPasahitza("password123");
        assertEquals("password123", bezeroa.getPasahitza());
    }

    @Test
    public void testSetPasahitza() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setPasahitza("password123");
        assertEquals("password123", bezeroa.getPasahitza());
    }

    @Test
    public void testEquals() {
        Bezeroa bezeroa1 = new Bezeroa();
        bezeroa1.setIzena("Jonan");
        Bezeroa bezeroa2 = new Bezeroa();
        bezeroa2.setIzena("Jonan");

        assertTrue(bezeroa1.equals(bezeroa2));
    }

    @Test
    public void testHashCode() {
        Bezeroa bezeroa1 = new Bezeroa();
        bezeroa1.setIzena("Jonan");
        Bezeroa bezeroa2 = new Bezeroa();
        bezeroa2.setIzena("Jonan");

        assertEquals(bezeroa1.hashCode(), bezeroa2.hashCode());
    }

    @Test
    public void testToString() {
        Bezeroa bezeroa = new Bezeroa();
        bezeroa.setIzena("Jonan");
        bezeroa.setAbizena("Apellido");
        bezeroa.setNan("123456789");
        bezeroa.setSexua('M');
        bezeroa.setPasahitza("password123");

        String expectedToString = "Bezeroa izenaJonan, abizenaApellido, nan123456789, sexuaM, pasahitzapassword123";
        assertEquals(expectedToString, bezeroa.toString());
    }
}
