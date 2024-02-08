package JUnit;

import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.Arrays;
import org.jdatepicker.JDatePicker;
import org.junit.Before;
import org.junit.Test;

import Modelo.Areto;
import Modelo.Karteldegia;
import Modelo.Saioa;

public class SaioaTest {

    private Saioa saioa;

    @Before
    public void setUp() {
        // Crear objetos necesarios para el test
        int id_saioa = 1;
        LocalDate ordua = LocalDate.now();
//        JDatePicker jDatePicker = new JDatePicker();
        Karteldegia[] karteldegiaList = new Karteldegia[5];
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
//        JDatePicker newDatePicker = new JDatePicker();
        saioa.setjDatePicker(null);
        assertEquals(null, saioa.getjDatePicker());
    }

    @Test
    public void testGetAndSetKarteldegiaList() {
        Karteldegia[] newKarteldegiaList = new Karteldegia[5];
        saioa.setKarteldegiaList(newKarteldegiaList);
        assertArrayEquals(newKarteldegiaList, saioa.getKarteldegiaList());
    }

    @Test
    public void testGetAndSetAretoaList() {
        Areto[] newAretoaList = new Areto[5];
        saioa.setAretoaList(newAretoaList);
        assertArrayEquals(newAretoaList, saioa.getAretoaList());
    }

    @Test
    public void testEquals() {
        Saioa sameSaioa = new Saioa(1, LocalDate.now(), null, new Karteldegia[5], new Areto[5]);
        assertTrue(saioa.equals(sameSaioa));
    }

    @Test
    public void testNotEquals() {
        Saioa differentSaioa = new Saioa(2, LocalDate.now().plusDays(1), null, new Karteldegia[5], new Areto[5]);
        assertFalse(saioa.equals(differentSaioa));
    }

    @Test
    public void testToString() {
        String expectedString = "Saioa [id_saioa=1, ordua=" + LocalDate.now() + ", jDatePicker=" + saioa.getjDatePicker()
                + ", karteldegiaList=" + Arrays.toString(saioa.getKarteldegiaList()) + ", aretoaList="
                + Arrays.toString(saioa.getAretoaList()) + "]";
        assertEquals(expectedString, saioa.toString());
    }
}
