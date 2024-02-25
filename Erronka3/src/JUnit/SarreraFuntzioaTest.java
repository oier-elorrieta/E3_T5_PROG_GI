package JUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Modelo.Sarrera;
import Modelo.SarreraFuntzioa;

public class SarreraFuntzioaTest {

    private SarreraFuntzioa sarreraFuntzioa;

    @Before
    public void setUp() {
        sarreraFuntzioa = SarreraFuntzioa.getInstance();
    }

    @After
    public void tearDown() {
        sarreraFuntzioa.reiniciarSarrerakList();
    }

    @Test
    public void testGetInstance() {
        SarreraFuntzioa instance1 = SarreraFuntzioa.getInstance();
        SarreraFuntzioa instance2 = SarreraFuntzioa.getInstance();
        assertEquals(instance1, instance2);
    }

    @Test
    public void testGetSarrerakList() {
        List<Sarrera> sarrerakList = sarreraFuntzioa.getSarrerakList();
        assertTrue(sarrerakList.isEmpty());
    }

    @Test
    public void testReiniciarSarrerakList() {
        sarreraFuntzioa.getSarrerakList().add(new Sarrera(1, null));
        sarreraFuntzioa.reiniciarSarrerakList();
        List<Sarrera> sarrerakList = sarreraFuntzioa.getSarrerakList();
        assertTrue(sarrerakList.isEmpty());
    }
}
