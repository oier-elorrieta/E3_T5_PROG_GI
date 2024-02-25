package JUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Modelo.Bezeroa;
import Modelo.Erosketa;
import Modelo.Sarrera;

public class ErosketaTest {

    @Test
    public void testGetBezeroa() {
        Bezeroa bezeroa = new Bezeroa(1, "Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        Erosketa erosketa = new Erosketa(null, bezeroa);
        erosketa.setBezeroa(bezeroa);
        assertEquals(bezeroa, erosketa.getBezeroa());
    }

    @Test
    public void testSetBezeroa() {
        Bezeroa bezeroa = new Bezeroa(1, "Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        Erosketa erosketa = new Erosketa(null, bezeroa);
        erosketa.setBezeroa(bezeroa);
        assertEquals(bezeroa, erosketa.getBezeroa());
    }

    @Test
    public void testGetDiruTotala() {
        Erosketa erosketa = new Erosketa(null, null);
        erosketa.setDiruTotala(100);
        assertEquals(100, erosketa.getDiruTotala());
    }

    @Test
    public void testSetDiruTotala() {
        Erosketa erosketa = new Erosketa(null, null);
        erosketa.setDiruTotala(200);
        assertEquals(200, erosketa.getDiruTotala());
    }

    @Test
    public void testGetSarreraList() {
        Sarrera[] sarreraList = { new Sarrera(1, null) };
        Erosketa erosketa = new Erosketa(sarreraList, null);
        erosketa.setSarreraList(sarreraList);
        assertArrayEquals(sarreraList, erosketa.getSarreraList());
    }

    @Test
    public void testSetSarreraList() {
        Sarrera[] sarreraList = { new Sarrera(1, null) };
        Erosketa erosketa = new Erosketa(sarreraList, null);
        erosketa.setSarreraList(sarreraList);
        assertArrayEquals(sarreraList, erosketa.getSarreraList());
    }

    @Test
    public void testGetId_erosketak() {
        Erosketa erosketa = new Erosketa(null, null);
        erosketa.setId_erosketak(1);
        assertEquals(1, erosketa.getId_erosketak());
    }

    @Test
    public void testSetId_erosketak() {
        Erosketa erosketa = new Erosketa(null, null);
        erosketa.setId_erosketak(2);
        assertEquals(2, erosketa.getId_erosketak());
    }

    @Test
    public void testEquals() {
        Bezeroa bezeroa1 = new Bezeroa(1, "Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        Bezeroa bezeroa2 = new Bezeroa(2, "Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        Sarrera[] sarreraList1 = { new Sarrera(1, null) };
        Sarrera[] sarreraList2 = { new Sarrera(2, null) };

        Erosketa erosketa1 = new Erosketa(sarreraList1, bezeroa1);
        erosketa1.setBezeroa(bezeroa1);
        erosketa1.setSarreraList(sarreraList1);
        erosketa1.setDiruTotala(100);
        erosketa1.setId_erosketak(1);

        Erosketa erosketa2 = new Erosketa(sarreraList2, bezeroa2);
        erosketa2.setBezeroa(bezeroa2);
        erosketa2.setSarreraList(sarreraList2);
        erosketa2.setDiruTotala(100);
        erosketa2.setId_erosketak(1);

        assertTrue(erosketa1.equals(erosketa2));
    }
}
