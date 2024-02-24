package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import Modelo.Areto;
import Modelo.Filma;
import Modelo.Saioa;
import Modelo.Sarrera;

import java.time.LocalDate;
import java.time.LocalTime;

public class SarreraTest {

    @Test
    public void testGetKantitatea() {
        Saioa saioa = new Saioa(null, null, null, null);
        Sarrera sarrera = new Sarrera(5, saioa);
        assertEquals(5, sarrera.getKantitatea());
    }

    @Test
    public void testSetKantitatea() {
        Saioa saioa = new Saioa(null, null, null, null);
        Sarrera sarrera = new Sarrera(0, saioa);
        sarrera.setKantitatea(10);
        assertEquals(10, sarrera.getKantitatea());
    }

    @Test
    public void testGetSaioa() {
    	Filma filma = new Filma("Pelikula1", 1, 120, "Drama", 10.0);
        Areto areto = new Areto("A1", "Areto1", "Zinema1");
        LocalTime ordua = LocalTime.of(15, 30);
        LocalDate date = LocalDate.of(2024, 2, 23);
        Saioa saioa = new Saioa(ordua, date, filma, areto);
        
        Sarrera sarrera = new Sarrera(0, saioa);
        assertEquals(saioa, sarrera.getSaioa());
    }

    @Test
    public void testSetSaioa() {
        Filma filma1 = new Filma("Pelikula1", 1, 120, "Drama", 10.0);
        Filma filma2 = new Filma("Pelikula2", 2, 150, "Comedia", 12.0);
        Areto areto1 = new Areto("A1", "Areto1", "Zinema1");
        Areto areto2 = new Areto("A2", "Areto2", "Zinema2");
        LocalTime ordua = LocalTime.of(15, 30);
        LocalDate date = LocalDate.of(2024, 2, 23);
        Saioa saioa1 = new Saioa(ordua, date, filma1, areto1);
        Saioa saioa2 = new Saioa(ordua, date, filma2, areto2);

        Sarrera sarrera = new Sarrera(0, saioa1);
        sarrera.setSaioa(saioa2);
        assertEquals(saioa2, sarrera.getSaioa());
    }

    @Test
    public void testEquals() {
        Filma filma1 = new Filma("Pelikula1", 1, 120, "Drama", 10.0);
        Filma filma2 = new Filma("Pelikula2", 2, 150, "Comedia", 12.0);
        Areto areto1 = new Areto("A1", "Areto1", "Zinema1");
        Areto areto2 = new Areto("A2", "Areto2", "Zinema2");
        LocalTime ordua = LocalTime.of(15, 30);
        LocalDate date = LocalDate.of(2024, 2, 23);
        Saioa saioa1 = new Saioa(ordua, date, filma1, areto1);
        Saioa saioa2 = new Saioa(ordua, date, filma2, areto2);
        
        Sarrera sarrera1 = new Sarrera(5, saioa1);
        Sarrera sarrera2 = new Sarrera(5, saioa1);
        Sarrera sarrera3 = new Sarrera(10, saioa1);
        Sarrera sarrera4 = new Sarrera(5, saioa2);

        assertEquals(sarrera1, sarrera2);
        assertNotEquals(sarrera1, sarrera3);
    }

    @Test
    public void testHashCode() {
        Filma filma = new Filma("Pelikula1", 1, 120, "Drama", 10.0);
        Areto areto = new Areto("A1", "Areto1", "Zinema1");
        LocalTime ordua = LocalTime.of(15, 30);
        LocalDate date = LocalDate.of(2024, 2, 23);
        Saioa saioa = new Saioa(ordua, date, filma, areto);

        Sarrera sarrera1 = new Sarrera(5, saioa);
        Sarrera sarrera2 = new Sarrera(5, saioa);

        assertEquals(sarrera1.hashCode(), sarrera2.hashCode());
    }

    @Test
    public void testToString() {
        Filma filma = new Filma("Pelikula1", 1, 120, "Drama", 10.0);
        Areto areto = new Areto("A1", "Areto1", "Zinema1");
        LocalTime ordua = LocalTime.of(15, 30);
        LocalDate date = LocalDate.of(2024, 2, 23);
        Saioa saioa = new Saioa(ordua, date, filma, areto);
        
        Sarrera sarrera = new Sarrera(5, saioa);
        assertEquals("Sarrera kantitatea 5, saioa " + saioa + "", sarrera.toString());
    }
}
