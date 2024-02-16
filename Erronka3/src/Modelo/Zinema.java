package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Zinema {
	private int id_zine;
	private String izena;
	private String helbidea;
	Saioa[] saioalist;
	Areto[] aretolist;

	public Zinema(int id_zine, String izena, String helbidea, Saioa[] saioalistArray, Areto[] aretolistarray) {
		this.id_zine = id_zine;
		this.izena = izena;
		this.helbidea = helbidea;
		saioalist = saioalistArray;
		aretolist = aretolistarray;
	}

	public int getId_zine() {
		return id_zine;
	}

	public void setId_zine(int id_zine) {
		this.id_zine = id_zine;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public Saioa[] getSaioalistArray() {
		return saioalist;
	}

	public void setSaioalistArray(Saioa[] saioalistArray) {
		saioalist = saioalistArray;
	}

	public Areto[] getAretolistarray() {
		return aretolist;
	}

	public void setAretolistarray(Areto[] aretolistarray) {
		aretolist = aretolistarray;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zinema other = (Zinema) obj;
		return Arrays.equals(aretolist, other.aretolist) && Arrays.equals(saioalist, other.saioalist)
				&& Objects.equals(helbidea, other.helbidea) && id_zine == other.id_zine
				&& Objects.equals(izena, other.izena);
	}

	@Override
	public String toString() {
		return "Zinema id_zine " + id_zine + ", izena " + izena + ", helbidea " + helbidea + ", Saioalist "
				+ Arrays.toString(saioalist) + ", Aretolist " + Arrays.toString(aretolist) + "";
	}

}
