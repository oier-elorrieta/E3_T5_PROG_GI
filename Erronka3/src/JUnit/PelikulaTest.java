package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Pelikula;

public class PelikulaTest {

	@Test
	public void testEquals() {
		Pelikula pelikula1 = new Pelikula("Film1", 1, 120, "Action", 9.99);
		Pelikula pelikula2 = new Pelikula("Film1", 1, 90, "Action", 8.99);
		Pelikula pelikula3 = new Pelikula("Film2", 2, 150, "Comedy", 7.99);

		assertTrue(pelikula1.equals(pelikula2));
		assertFalse(pelikula1.equals(pelikula3));
	}

	@Test
	public void testHashCode() {
		Pelikula pelikula1 = new Pelikula("Film1", 1, 120, "Action", 9.99);
		Pelikula pelikula2 = new Pelikula("Film1", 1, 90, "Action", 8.99);
		Pelikula pelikula3 = new Pelikula("Film2", 2, 150, "Comedy", 7.99);

		assertEquals(pelikula1.hashCode(), pelikula2.hashCode());

		assertNotEquals(pelikula1.hashCode(), pelikula3.hashCode());
	}

	@Test
	public void testToString() {
		Pelikula pelikula = new Pelikula("Film1", 1, 120, "Action", 9.99);
		String expectedString = "Pelikula izena Film1, identifikatzailea 1, iraupena 120, generoa Action, prezioa 9.99 ";

		assertEquals(expectedString, pelikula.toString());
	}
}
