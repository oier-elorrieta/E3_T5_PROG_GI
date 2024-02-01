package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

public class ErosketakTest {

    @Test
    public void testEquals() {
        Erosketak erosketak1 = new Erosketak();
        erosketak1.setDiruTotala(100);
        erosketak1.setKantitatea(5);
        erosketak1.setId_erosketak(1);
        erosketak1.setJatorria(1);

        Erosketak erosketak2 = new Erosketak();
        erosketak2.setDiruTotala(100);
        erosketak2.setKantitatea(5);
        erosketak2.setId_erosketak(1);
        erosketak2.setJatorria(1);

        Erosketak erosketak3 = new Erosketak();
        erosketak3.setDiruTotala(150);
        erosketak3.setKantitatea(3);
        erosketak3.setId_erosketak(2);
        erosketak3.setJatorria(2);

        // Prueba de igualdad
        assertTrue(erosketak1.equals(erosketak2));
        assertFalse(erosketak1.equals(erosketak3));
    }

    @Test
    public void testHashCode() {
        Erosketak erosketak1 = new Erosketak();
        erosketak1.setDiruTotala(100);
        erosketak1.setKantitatea(5);
        erosketak1.setId_erosketak(1);
        erosketak1.setJatorria(1);

        Erosketak erosketak2 = new Erosketak();
        erosketak2.setDiruTotala(100);
        erosketak2.setKantitatea(5);
        erosketak2.setId_erosketak(1);
        erosketak2.setJatorria(1);

        Erosketak erosketak3 = new Erosketak();
        erosketak3.setDiruTotala(150);
        erosketak3.setKantitatea(3);
        erosketak3.setId_erosketak(2);
        erosketak3.setJatorria(2);

        // Prueba de hashcode para objetos iguales
        assertEquals(erosketak1.hashCode(), erosketak2.hashCode());

        // Asegurar que objetos diferentes tengan hashcodes diferentes
        assertNotEquals(erosketak1.hashCode(), erosketak3.hashCode());
    }

    @Test
    public void testToString() {
        Erosketak erosketak = new Erosketak();
        erosketak.setDiruTotala(100);
        erosketak.setKantitatea(5);
        erosketak.setId_erosketak(1);
        erosketak.setJatorria(1);

        String expectedString = "Erosketak [diruTotala=100, kantitatea=5, id_erosketak=1, jatorria=1]";
        
        // Prueba de toString
        assertEquals(expectedString, erosketak.toString());
    }

    // Puedes agregar más casos de prueba según sea necesario.
}

