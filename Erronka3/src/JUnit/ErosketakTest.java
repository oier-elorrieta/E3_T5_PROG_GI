package JUnit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import Modelo.Erosketak;
import Modelo.Sarrera;
import Modelo.Saioa;

public class ErosketakTest {

    @Test
    public void testConstructorAndGetters() {
        int diruTotala = 100;
        Sarrera[] sarreraList = {new Sarrera("mota1", new Saioa[5]), new Sarrera("mota2", new Saioa[5]),
                new Sarrera("mota3", new Saioa[5]), new Sarrera("mota4", new Saioa[5]),
                new Sarrera("mota5", new Saioa[5])};
        int id_erosketak = 1;

        Erosketak erosketak = new Erosketak(diruTotala, sarreraList, id_erosketak);

        assertEquals(diruTotala, erosketak.getDiruTotala());
        assertArrayEquals(sarreraList, erosketak.getSarreraList());
        assertEquals(id_erosketak, erosketak.getId_erosketak());
    }

    @Test
    public void testSetters() {
        Erosketak erosketak = new Erosketak();

        int diruTotala = 200;
        erosketak.setDiruTotala(diruTotala);
        assertEquals(diruTotala, erosketak.getDiruTotala());

        Sarrera[] sarreraList = {new Sarrera("mota1", new Saioa[5]), new Sarrera("mota2", new Saioa[5]),
                new Sarrera("mota3", new Saioa[5]), new Sarrera("mota4", new Saioa[5]),
                new Sarrera("mota5", new Saioa[5])};
        erosketak.setSarreraList(sarreraList);
        assertArrayEquals(sarreraList, erosketak.getSarreraList());

        int id_erosketak = 2;
        erosketak.setId_erosketak(id_erosketak);
        assertEquals(id_erosketak, erosketak.getId_erosketak());
    }

    @Test
    public void testEquals() {
        int diruTotala = 100;
        Sarrera[] sarreraList1 = {new Sarrera("mota1", new Saioa[5]), new Sarrera("mota2", new Saioa[5]),
                new Sarrera("mota3", new Saioa[5]), new Sarrera("mota4", new Saioa[5]),
                new Sarrera("mota5", new Saioa[5])};
        Sarrera[] sarreraList2 = {new Sarrera("mota1", new Saioa[5]), new Sarrera("mota2", new Saioa[5]),
                new Sarrera("mota3", new Saioa[5]), new Sarrera("mota4", new Saioa[5]),
                new Sarrera("mota5", new Saioa[5])};
        int id_erosketak = 1;

        Erosketak erosketak1 = new Erosketak(diruTotala, sarreraList1, id_erosketak);
        Erosketak erosketak2 = new Erosketak(diruTotala, sarreraList2, id_erosketak);

        assertTrue(erosketak1.equals(erosketak2));
    }

    @Test
    public void testToString() {
        int diruTotala = 100;
        Sarrera[] sarreraList = {new Sarrera("mota1", new Saioa[5]), new Sarrera("mota2", new Saioa[5]),
                new Sarrera("mota3", new Saioa[5]), new Sarrera("mota4", new Saioa[5]),
                new Sarrera("mota5", new Saioa[5])};
        int id_erosketak = 1;

        Erosketak erosketak = new Erosketak(diruTotala, sarreraList, id_erosketak);

        String expectedToString = "Erosketak [diruTotala=" + diruTotala + ", SarreraList=" + Arrays.toString(sarreraList)
                + ", id_erosketak=" + id_erosketak + "]";

        assertEquals(expectedToString, erosketak.toString());
    }
}
