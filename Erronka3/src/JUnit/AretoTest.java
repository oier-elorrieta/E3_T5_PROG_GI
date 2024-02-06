package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Areto;
import Modelo.Saioa;

public class AretoTest {

    @Test
    public void testGetId_areto() {
        Areto areto = new Areto(1, "Areto1", new Saioa[5]);
        assertEquals(1, areto.getId_areto());
    }

    @Test
    public void testSetId_areto() {
        Areto areto = new Areto(1, "Areto1", new Saioa[5]);
        areto.setId_areto(2);
        assertEquals(2, areto.getId_areto());
    }

    @Test
    public void testGetIzena() {
        Areto areto = new Areto(1, "Areto1", new Saioa[5]);
        assertEquals("Areto1", areto.getIzena());
    }

    @Test
    public void testSetIzena() {
        Areto areto = new Areto(1, "Areto1", new Saioa[5]);
        areto.setIzena("Areto2");
        assertEquals("Areto2", areto.getIzena());
    }

    @Test
    public void testGetSaioaList() {
        Saioa[] saioaList = {new Saioa(1, "Saioa1"), new Saioa(2, "Saioa2")};
        Areto areto = new Areto(1, "Areto1", saioaList);
        assertArrayEquals(saioaList, areto.getSaioaList());
    }

    @Test
    public void testSetSaioaList() {
        Saioa[] saioaList = {new Saioa(1, "Saioa1"), new Saioa(2, "Saioa2")};
        Saioa[] newSaioaList = {new Saioa(3, "Saioa3"), new Saioa(4, "Saioa4")};
        Areto areto = new Areto(1, "Areto1", saioaList);
        areto.setSaioaList(newSaioaList);
        assertArrayEquals(newSaioaList, areto.getSaioaList());
    }
}
