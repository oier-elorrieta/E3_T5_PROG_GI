package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Modelo.Areto;

public class AretoTest {

    @Test
    public void testGettersAndSetters() {
        Areto areto = new Areto("A1", "Areto1", "Z1");
        
        assertEquals("A1", areto.getId_areto());
        assertEquals("Areto1", areto.getIzena());
        assertEquals("Z1", areto.getZinema_id());
        
        areto.setId_areto("A2");
        areto.setIzena("Areto2");
        areto.setZinema_id("Z2");
        
        assertEquals("A2", areto.getId_areto());
        assertEquals("Areto2", areto.getIzena());
        assertEquals("Z2", areto.getZinema_id());
    }
    
    @Test
    public void testEquals() {
        Areto areto1 = new Areto("A1", "Areto1", "Z1");
        Areto areto2 = new Areto("A1", "Areto1", "Z1");
        Areto areto3 = new Areto("A2", "Areto2", "Z2");
        
        assertTrue(areto1.equals(areto2));
        assertFalse(areto1.equals(areto3));
    }
    
    @Test
    public void testToString() {
        Areto areto = new Areto("A1", "Areto1", "Z1");
        String expected = "Areto [id_areto=A1, izena=Areto1, zinema_id=Z1]";
        
        assertEquals(expected, areto.toString());
    }
}
