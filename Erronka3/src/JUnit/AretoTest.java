package JUnit;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Arrays;

import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.UtilDateModel;
import org.junit.Before;
import org.junit.Test;

import Modelo.Areto;
import Modelo.Karteldegia;
import Modelo.Saioa;

public class AretoTest {
    private Areto areto;
    private Saioa[] saioak;
//    private JDatePicker jDatePicker = new JDatePicker();
    @Before
    public void setUp() {
        saioak = new Saioa[5];
        for (int i = 0; i < 5; i++) {
        	LocalDate ordua = LocalDate.now();
//            JDatePicker jDatePicker = new JDatePicker(); // Aquí creamos una instancia de JDatePicker
            Karteldegia[] karteldegiaList = new Karteldegia[5];
            Areto[] aretoaList = new Areto[5];
            saioak[i] = new Saioa(i + 1, ordua, null, karteldegiaList, aretoaList);
        }
        areto = new Areto(1, "Nombre del Areto", saioak);
    }

    @Test
    public void testGetId_areto() {
        assertEquals(1, areto.getId_areto());
    }

    @Test
    public void testGetIzena() {
        assertEquals("Nombre del Areto", areto.getIzena());
    }

    @Test
    public void testGetSaioaList() {
        assertArrayEquals(saioak, areto.getSaioaList());
    }

    @Test
    public void testSetId_areto() {
        areto.setId_areto(2);
        assertEquals(2, areto.getId_areto());
    }

    @Test
    public void testSetIzena() {
        areto.setIzena("Nuevo nombre del Areto");
        assertEquals("Nuevo nombre del Areto", areto.getIzena());
    }

    @Test
    public void testSetSaioaList() {
        Saioa[] newSaioak = new Saioa[3];
        for (int i = 0; i < 5; i++) {
        	LocalDate ordua = LocalDate.now();
//            JDatePicker jDatePicker = new JDatePicker(); // Aquí creamos una instancia de JDatePicker
            Karteldegia[] karteldegiaList = new Karteldegia[5];
            Areto[] aretoaList = new Areto[5];
            saioak[i] = new Saioa(i + 1, ordua, null, karteldegiaList, aretoaList);
        }
        areto.setSaioaList(newSaioak);
        assertArrayEquals(newSaioak, areto.getSaioaList());
    }

    @Test
    public void testEquals() {
        Areto sameAreto = new Areto(1, "Nombre del Areto", saioak);
        assertTrue(areto.equals(sameAreto));

        Areto differentAreto = new Areto(2, "Nombre diferente", saioak);
        assertFalse(areto.equals(differentAreto));
    }

    @Test
    public void testHashCode() {
        Areto sameAreto = new Areto(1, "Nombre del Areto", saioak);
        assertEquals(areto.hashCode(), sameAreto.hashCode());

        Areto differentAreto = new Areto(2, "Nombre diferente", saioak);
        assertNotEquals(areto.hashCode(), differentAreto.hashCode());
    }

    @Test
    public void testToString() {
        String expectedString = "Areto [id_areto=1, izena=Nombre del Areto, SaioaList=" + Arrays.toString(saioak) + "]";
        assertEquals(expectedString, areto.toString());
    }
}
