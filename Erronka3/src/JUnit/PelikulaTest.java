package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.Pelikula;

public class PelikulaTest {

    @Test
    public void testGetIzena() {
        Pelikula peli = new Pelikula("Izena", 1, 120, "Generoa", 10.5);
        assertEquals("Izena", peli.getIzena());
    }

    @Test
    public void testSetIzena() {
        Pelikula peli = new Pelikula("Izena", 1, 120, "Generoa", 10.5);
        peli.setIzena("Beste Izena");
        assertEquals("Beste Izena", peli.getIzena());
    }

    @Test
    public void testGetId_peli() {
        Pelikula peli = new Pelikula("Izena", 1, 120, "Generoa", 10.5);
        assertEquals(1, peli.getId_peli());
    }

    @Test
    public void testSetId_peli() {
        Pelikula peli = new Pelikula("Izena", 1, 120, "Generoa", 10.5);
        peli.setId_peli(2);
        assertEquals(2, peli.getId_peli());
    }

    @Test
    public void testGetIraupena() {
        Pelikula peli = new Pelikula("Izena", 1, 120, "Generoa", 10.5);
        assertEquals(120, peli.getIraupena());
    }

    @Test
    public void testSetIraupena() {
        Pelikula peli = new Pelikula("Izena", 1, 120, "Generoa", 10.5);
        peli.setIraupena(90);
        assertEquals(90, peli.getIraupena());
    }

    @Test
    public void testGetGeneroa() {
        Pelikula peli = new Pelikula("Izena", 1, 120, "Generoa", 10.5);
        assertEquals("Generoa", peli.getGeneroa());
    }

    @Test
    public void testSetGeneroa() {
        Pelikula peli = new Pelikula("Izena", 1, 120, "Generoa", 10.5);
        peli.setGeneroa("Beste Generoa");
        assertEquals("Beste Generoa", peli.getGeneroa());
    }

    @Test
    public void testGetPrezioa() {
        Pelikula peli = new Pelikula("Izena", 1, 120, "Generoa", 10.5);
        assertEquals(10.5, peli.getPrezioa(), 0.01);
    }

    @Test
    public void testSetPrezioa() {
        Pelikula peli = new Pelikula("Izena", 1, 120, "Generoa", 10.5);
        peli.setPrezioa(9.99);
        assertEquals(9.99, peli.getPrezioa(), 0.01);
    }
}
