package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.time.LocalDate;
import org.junit.Test;

import Modelo.Areto;
import Modelo.Filmak;
import Modelo.Saioa;

public class SaioaTest {

    @Test
    public void testGetOrdua() {
        Filmak filma = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto(1, "Areto Izena");
        Saioa saioa = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma, aretoa);
        assertEquals(LocalDate.of(2024, 2, 8), saioa.getOrdua());
    }

    @Test
    public void testSetOrdua() {
        Filmak filma = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto(1, "Areto Izena");
        Saioa saioa = new Saioa(null, null, filma, aretoa);
        saioa.setOrdua(LocalDate.of(2024, 2, 8));
        assertEquals(LocalDate.of(2024, 2, 8), saioa.getOrdua());
    }

    @Test
    public void testGetDate() {
        Filmak filma = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto(1, "Areto Izena");
        Saioa saioa = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma, aretoa);
        assertEquals(LocalDate.of(2024, 2, 8), saioa.getDate());
    }

    @Test
    public void testSetDate() {
        Filmak filma = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto(1, "Areto Izena");
        Saioa saioa = new Saioa(null, null, filma, aretoa);
        saioa.setDate(LocalDate.of(2024, 2, 8));
        assertEquals(LocalDate.of(2024, 2, 8), saioa.getDate());
    }

    @Test
    public void testGetFilma() {
        Filmak filma = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto(1, "Areto Izena");
        Saioa saioa = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma, aretoa);
        assertEquals(filma, saioa.getFilma());
    }

    @Test
    public void testSetFilma() {
        Filmak filma1 = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Filmak filma2 = new Filmak("Beste Izena", 2, 90, "Beste Generoa", 8.0);
        Areto aretoa = new Areto(1, "Areto Izena");
        Saioa saioa = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma1, aretoa);
        saioa.setFilma(filma2);
        assertEquals(filma2, saioa.getFilma());
    }

    @Test
    public void testGetAretoa() {
        Filmak filma = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto(1, "Areto Izena");
        Saioa saioa = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma, aretoa);
        assertEquals(aretoa, saioa.getAretoa());
    }

    @Test
    public void testSetAretoa() {
        Filmak filma = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa1 = new Areto(1, "Areto Izena");
        Areto aretoa2 = new Areto(2, "Beste Areto Izena");
        Saioa saioa = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma, aretoa1);
        saioa.setAretoa(aretoa2);
        assertEquals(aretoa2, saioa.getAretoa());
    }
@Test
    public void testEquals() {
        Filmak filma1 = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Filmak filma2 = new Filmak("Beste Izena", 2, 90, "Beste Generoa", 8.0);
        Areto aretoa1 = new Areto(1, "Areto Izena");
        Areto aretoa2 = new Areto(2, "Beste Areto Izena");
        Saioa saioa1 = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma1, aretoa1);
        Saioa saioa2 = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma1, aretoa1);
        Saioa saioa3 = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma2, aretoa1);
        Saioa saioa4 = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma1, aretoa2);

        assertEquals(saioa1, saioa2);
        assertNotEquals(saioa1, saioa3);
        assertNotEquals(saioa1, saioa4);
    }

    @Test
    public void testHashCode() {
        Filmak filma = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto(1, "Areto Izena");
        Saioa saioa1 = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma, aretoa);
        Saioa saioa2 = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma, aretoa);

        assertEquals(saioa1.hashCode(), saioa2.hashCode());
    }

    @Test
    public void testToString() {
        Filmak filma = new Filmak("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto(1, "Areto Izena");
        Saioa saioa = new Saioa(LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 8), filma, aretoa);
        assertEquals("Saioa [ordua=2024-02-08, date=2024-02-08, filma=" + filma + ", Aretoa=" + aretoa + "]",
                saioa.toString());
    }
}

