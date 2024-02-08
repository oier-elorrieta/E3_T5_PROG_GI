package JUnit;

import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

import Modelo.Areto;
import Modelo.Pelikula;
import Modelo.Saioa;

public class SaioaTest {

    private Saioa saioa;

    @Before
    public void setUp() {
        // Crear objetos necesarios para el test
        int id_saioa = 1;
        LocalDate ordua = LocalDate.now();

        Pelikula[] karteldegiaList = new Pelikula[5];
        Areto[] aretoaList = new Areto[5];
        saioa = new Saioa(id_saioa, ordua, null, karteldegiaList, aretoaList);
    }

    @Test
    public void testGetId_saioa() {
        assertEquals(1, saioa.getId_saioa());
    }

    @Test
    public void testGetOrdua() {
        assertEquals(LocalDate.now(), saioa.getOrdua());
    }

    @Test
    public void testGetAndSetJDatePicker() {

        saioa.setjDatePicker(null);
        assertEquals(null, saioa.getjDatePicker());
    }

    @Test
    public void testGetAndSetKarteldegiaList() {
    	Pelikula [] newPelikulaList = new Pelikula[5];
        saioa.setPelikulaList(newPelikulaList);
        assertArrayEquals(newPelikulaList, saioa.getPelikulaList());
    }

    @Test
    public void testGetAndSetAretoaList() {
        Areto[] newAretoaList = new Areto[5];
        saioa.setAretoaList(newAretoaList);
        assertArrayEquals(newAretoaList, saioa.getAretoaList());
    }

    @Test
    public void testEquals() {
        Saioa sameSaioa = new Saioa(1, LocalDate.now(), null, new Pelikula[5], new Areto[5]);
        assertTrue(saioa.equals(sameSaioa));
    }

    @Test
    public void testNotEquals() {
        Saioa differentSaioa = new Saioa(2, LocalDate.now().plusDays(1), null, new Pelikula[5], new Areto[5]);
        assertFalse(saioa.equals(differentSaioa));
    }

    @Test
    public void testToString() {
        String expectedString = "Saioa [id_saioa=1, ordua=" + LocalDate.now() + ", jDatePicker=" + saioa.getjDatePicker()
                + ", karteldegiaList=" + Arrays.toString(saioa.getPelikulaList()) + ", aretoaList="
                + Arrays.toString(saioa.getAretoaList()) + "]";
        assertEquals(expectedString, saioa.toString());
    }
}
