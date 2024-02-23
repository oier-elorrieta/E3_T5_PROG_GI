package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.Areto;
import Modelo.Saioa;
import Modelo.Zinema;

public class ZinemaTest {

    @Test
    public void testGetSaioalistArray() {
        Saioa[] saioaList = new Saioa[5];
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", saioaList, null);
        assertArrayEquals(saioaList, zinema.getSaioalist());
    }

    @Test
    public void testSetSaioalistArray() {
        Saioa[] saioaList = new Saioa[5];
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        zinema.setSaioalist(saioaList);
        assertArrayEquals(saioaList, zinema.getSaioalist());
    }

    @Test
    public void testGetAretolistarray() {
        Areto[] aretoList = new Areto[5];
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, aretoList);
        assertArrayEquals(aretoList, zinema.getAretolist());
    }

    @Test
    public void testSetAretolistarray() {
        Areto[] aretoList = new Areto[5];
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        zinema.setAretolist(aretoList);
        assertArrayEquals(aretoList, zinema.getAretolist());
    }

    @Test
    public void testGetId_zine() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        assertEquals("Z1", zinema.getId_zine());
    }

    @Test
    public void testSetId_zine() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        zinema.setId_zine("Z2");
        assertEquals("Z2", zinema.getId_zine());
    }

    @Test
    public void testGetIzena() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        assertEquals("Zinemaldia", zinema.getIzena());
    }

    @Test
    public void testSetIzena() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        zinema.setIzena("Zinefest");
        assertEquals("Zinefest", zinema.getIzena());
    }

    @Test
    public void testGetHelbidea() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        assertEquals("Bilbao", zinema.getHelbidea());
    }

    @Test
    public void testSetHelbidea() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        zinema.setHelbidea("Donostia");
        assertEquals("Donostia", zinema.getHelbidea());
    }


    @Test
    public void testNotEquals() {
        Zinema zinema1 = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        Zinema zinema2 = new Zinema("Z1", "Zinefest", "Donostia", null, null);

        assertFalse(zinema1.equals(zinema2));
    }

    @Test
    public void testToString() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);

        String expectedToString = "Zinema [id_zine=Z1, izena=Zinemaldia, helbidea=Bilbao, saioalist=null, aretolist=null]";
        assertEquals(expectedToString, zinema.toString());
    }
}
