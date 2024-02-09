package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Erosketak;
import Modelo.Sarrera;

public class ErosketakTest {

    @Test
    public void testGetDiruTotala() {
        Erosketak erosketak = new Erosketak(100, null, 1);
        assertEquals(100, erosketak.getDiruTotala());
    }

    @Test
    public void testSetDiruTotala() {
        Erosketak erosketak = new Erosketak();
        erosketak.setDiruTotala(200);
        assertEquals(200, erosketak.getDiruTotala());
    }

    @Test
    public void testGetSarreraList() {
        Sarrera[] sarreraList = {new Sarrera(1, null)};
        Erosketak erosketak = new Erosketak(100, sarreraList, 1);
        assertArrayEquals(sarreraList, erosketak.getSarreraList());
    }

    @Test
    public void testSetSarreraList() {
        Sarrera[] sarreraList = {new Sarrera(1, null)};
        Erosketak erosketak = new Erosketak();
        erosketak.setSarreraList(sarreraList);
        assertArrayEquals(sarreraList, erosketak.getSarreraList());
    }

    @Test
    public void testGetId_erosketak() {
        Erosketak erosketak = new Erosketak(100, null, 1);
        assertEquals(1, erosketak.getId_erosketak());
    }

    @Test
    public void testSetId_erosketak() {
        Erosketak erosketak = new Erosketak();
        erosketak.setId_erosketak(2);
        assertEquals(2, erosketak.getId_erosketak());
    }

    @Test
    public void testEquals() {
        Sarrera[] sarreraList1 = {new Sarrera(1, null)};
        Sarrera[] sarreraList2 = {new Sarrera(1, null)};
        Erosketak erosketak1 = new Erosketak(100, sarreraList1, 1);
        Erosketak erosketak2 = new Erosketak(100, sarreraList2, 1);
        assertEquals(erosketak1, erosketak2);
    }


      	@Test
        public void testToString() {
            Sarrera[] sarreraList = {new Sarrera(1, null)};
            Erosketak erosketak = new Erosketak(100, sarreraList, 1);
            assertEquals("Erosketak [diruTotala=100, SarreraList=[Sarrera [kantitatea=1, saioa=null]], id_erosketak=1]", erosketak.toString());
        }
    }

