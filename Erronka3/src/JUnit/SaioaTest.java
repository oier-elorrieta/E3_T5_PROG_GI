package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Saioa;

public class SaioaTest {

	@Test
	public void testEquals() {
		Saioa saioa1 = new Saioa(1);
		Saioa saioa2 = new Saioa(1);
		Saioa saioa3 = new Saioa(2);

		assertTrue(saioa1.equals(saioa2));
		assertFalse(saioa1.equals(saioa3));
	}

	@Test
	public void testHashCode() {
		Saioa saioa1 = new Saioa(1);
		Saioa saioa2 = new Saioa(1);
		Saioa saioa3 = new Saioa(2);

		assertEquals(saioa1.hashCode(), saioa2.hashCode());

		assertNotEquals(saioa1.hashCode(), saioa3.hashCode());
	}

	@Test
	public void testToString() {
		Saioa saioa = new Saioa(1);
		String expectedString = "Saioa [id_saioa=1, ordua=0]";

		assertEquals(expectedString, saioa.toString());
	}
}
