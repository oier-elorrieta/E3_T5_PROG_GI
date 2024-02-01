package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Sarrera;

public class SarreraTest {

	@Test
	public void testEquals() {
		Sarrera sarrera1 = new Sarrera(1, 10.0);
		Sarrera sarrera2 = new Sarrera(1, 10.0);
		Sarrera sarrera3 = new Sarrera(2, 15.0);

		assertTrue(sarrera1.equals(sarrera2));
		assertFalse(sarrera1.equals(sarrera3));
	}

	@Test
	public void testHashCode() {
		Sarrera sarrera1 = new Sarrera(1, 10.0);
		Sarrera sarrera2 = new Sarrera(1, 10.0);
		Sarrera sarrera3 = new Sarrera(2, 15.0);

		assertEquals(sarrera1.hashCode(), sarrera2.hashCode());

		assertNotEquals(sarrera1.hashCode(), sarrera3.hashCode());
	}

	@Test
	public void testToString() {
		Sarrera sarrera = new Sarrera(1, 10.0);
		String expectedString = "Sarrera1, prezioa10.0";

		assertEquals(expectedString, sarrera.toString());
	}

}
