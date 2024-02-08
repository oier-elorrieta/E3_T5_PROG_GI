package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;
import Modelo.Karteldegia;
import Modelo.Pelikula;

public class KarteldegiaTest {

    @Test
    public void testConstructorAndGetters() {
        Pelikula[] pelikulaList = {new Pelikula("Pelikula1", 1, 120, "Aktiona", 10.99),
                                   new Pelikula("Pelikula2", 2, 110, "Komedia", 9.99),
                                   new Pelikula("Pelikula3", 3, 130, "Drama", 11.99),
                                   new Pelikula("Pelikula4", 4, 100, "Thriller", 12.99),
                                   new Pelikula("Pelikula5", 5, 150, "Fantasia", 14.99)};

        Karteldegia karteldegia = new Karteldegia(pelikulaList);

        assertArrayEquals(pelikulaList, karteldegia.getPelikulaList());
    }

    @Test
    public void testSetters() {
        Karteldegia karteldegia = new Karteldegia(new Pelikula[5]);

        Pelikula[] newPelikulaList = {new Pelikula("Pelikula1", 1, 120, "Aktiona", 10.99),
                                      new Pelikula("Pelikula2", 2, 110, "Komedia", 9.99),
                                      new Pelikula("Pelikula3", 3, 130, "Drama", 11.99),
                                      new Pelikula("Pelikula4", 4, 100, "Thriller", 12.99),
                                      new Pelikula("Pelikula5", 5, 150, "Fantasia", 14.99)};

        karteldegia.setPelikulaList(newPelikulaList);

        assertArrayEquals(newPelikulaList, karteldegia.getPelikulaList());
    }

    @Test
    public void testEquals() {
        Pelikula[] pelikulaList1 = {new Pelikula("Pelikula1", 1, 120, "Aktiona", 10.99),
                                    new Pelikula("Pelikula2", 2, 110, "Komedia", 9.99),
                                    new Pelikula("Pelikula3", 3, 130, "Drama", 11.99),
                                    new Pelikula("Pelikula4", 4, 100, "Thriller", 12.99),
                                    new Pelikula("Pelikula5", 5, 150, "Fantasia", 14.99)};

        Pelikula[] pelikulaList2 = {new Pelikula("Pelikula1", 1, 120, "Aktiona", 10.99),
                                    new Pelikula("Pelikula2", 2, 110, "Komedia", 9.99),
                                    new Pelikula("Pelikula3", 3, 130, "Drama", 11.99),
                                    new Pelikula("Pelikula4", 4, 100, "Thriller", 12.99),
                                    new Pelikula("Pelikula5", 5, 150, "Fantasia", 14.99)};

        Karteldegia karteldegia1 = new Karteldegia(pelikulaList1);
        Karteldegia karteldegia2 = new Karteldegia(pelikulaList2);

        assertTrue(karteldegia1.equals(karteldegia2));
    }

    @Test
    public void testToString() {
        Pelikula[] pelikulaList = {new Pelikula("Pelikula1", 1, 120, "Aktiona", 10.99),
                                   new Pelikula("Pelikula2", 2, 110, "Komedia", 9.99),
                                   new Pelikula("Pelikula3", 3, 130, "Drama", 11.99),
                                   new Pelikula("Pelikula4", 4, 100, "Thriller", 12.99),
                                   new Pelikula("Pelikula5", 5, 150, "Fantasia", 14.99)};

        Karteldegia karteldegia = new Karteldegia(pelikulaList);

        String expectedToString = "Karteldegia [pelikulaList=" + pelikulaList.toString() + "]";

        assertEquals(expectedToString, karteldegia.toString());
        
    }


}
