package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Bezeroa;

public class BezeroaTest {

    @Test
    public void testGetIzena() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        assertEquals("Izena", bezeroa.getIzena());
    }

    @Test
    public void testSetIzena() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        bezeroa.setIzena("Izena2");
        assertEquals("Izena2", bezeroa.getIzena());
    }

    @Test
    public void testGetAbizena() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        assertEquals("Abizena", bezeroa.getAbizena());
    }

    @Test
    public void testSetAbizena() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        bezeroa.setAbizena("Abizena2");
        assertEquals("Abizena2", bezeroa.getAbizena());
    }

    @Test
    public void testGetNan() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        assertEquals("12345678A", bezeroa.getNan());
    }

    @Test
    public void testSetNan() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        bezeroa.setNan("87654321B");
        assertEquals("87654321B", bezeroa.getNan());
    }

    @Test
    public void testGetSexua() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        assertEquals('M', bezeroa.getSexua());
    }

    @Test
    public void testSetSexua() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        bezeroa.setSexua('F');
        assertEquals('F', bezeroa.getSexua());
    }

    @Test
    public void testGetPasahitza() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        assertEquals("password", bezeroa.getPasahitza());
    }

    @Test
    public void testSetPasahitza() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        bezeroa.setPasahitza("newpassword");
        assertEquals("newpassword", bezeroa.getPasahitza());
    }

    @Test
    public void testEquals() {
        Bezeroa bezeroa1 = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        Bezeroa bezeroa2 = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        assertTrue(bezeroa1.equals(bezeroa2));
    }

    @Test
    public void testHashCode() {
        Bezeroa bezeroa1 = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        Bezeroa bezeroa2 = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        assertEquals(bezeroa1.hashCode(), bezeroa2.hashCode());
    }

    @Test
    public void testToString() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", 'M', "password");
        assertEquals("Bezeroa izenaIzena, abizenaAbizena, nan12345678A, sexuaM, pasahitzapassword", bezeroa.toString());
    }
}
