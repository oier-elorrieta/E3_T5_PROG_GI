package JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test; 

import Modelo.Areto;
import Modelo.Bezeroa;
import Modelo.Saioa;
import Modelo.Sarrera;
import Modelo.Zinema;

public class Junittest {

	@Test
	public void testZinema() {
		Zinema zinema = new Zinema(1, "Zinema1", "Helbidea1");

		zinema.setId_zine(2);
		zinema.setIzena("Zinema2");
		zinema.setHelbidea("Helbidea2");

		assertEquals(2, zinema.getId_zine());
		assertEquals("Zinema2", zinema.getIzena());
		assertEquals("Helbidea2", zinema.getHelbidea());
	}

	@Test
	public void testBezeroa() {

		Bezeroa bezeroa = new Bezeroa("John Doe", "john_doe", "123456789", 'M', "jon@proba.com", "password");

		bezeroa.setIzena("Jane Doe");
		bezeroa.setErabiltzailea("jane_doe");
		bezeroa.setNan("987654321");
		bezeroa.setSexua('M');
		bezeroa.setEmail("jon@proba.com");
		bezeroa.setPasahitza("newpassword");

		assertEquals("Jane Doe", bezeroa.getIzena());
		assertEquals("jane_doe", bezeroa.getErabiltzailea());
		assertEquals("987654321", bezeroa.getNan());
		assertEquals('M', bezeroa.getSexua());
		assertEquals("jon@proba.com", bezeroa.getEmail());
		assertEquals("newpassword", bezeroa.getPasahitza());
	}
	@Test
	public void testAreto() {
		Areto areto = new Areto(1, "Areto 1", 100);

		areto.setId_areto(2);
		areto.setIzena("Areto 2");

		assertEquals(2, areto.getId_areto());
		assertEquals("Areto 2", areto.getIzena());
	}
	@Test
	public void testSarrera() {
		Sarrera sarrera = new Sarrera(1, 10.0);

		sarrera.setId_sarrera(2);
		sarrera.setPrezioa(15.0);

		assertEquals(2, sarrera.getId_sarrera());
		assertEquals(15.0, sarrera.getPrezioa(), 0.01);
	}
	@Test
	public void testSaioa() {
		Saioa saioa = new Saioa(1);

		saioa.setId_saioa(2);

		assertEquals(2, saioa.getId_saioa());
	}
}
