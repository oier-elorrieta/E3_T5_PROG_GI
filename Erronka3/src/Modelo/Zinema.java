package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Zinema {
	private int id_zine;
	private String izena;
	private String helbidea;
	Saioa[] SaioalistArray = new Saioa[5];
	Areto[] Aretolistarray = new Areto[5];
	public Zinema(int id_zine, String izena, String helbidea, Saioa[] saioalistArray, Areto[] aretolistarray) {
		this.id_zine = id_zine;
		this.izena = izena;
		this.helbidea = helbidea;
		SaioalistArray = saioalistArray;
		Aretolistarray = aretolistarray;
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
		return SaioalistArray;
	}
	public void setSaioalistArray(Saioa[] saioalistArray) {
		SaioalistArray = saioalistArray;
	}
	public Areto[] getAretolistarray() {
		return Aretolistarray;
	}
	public void setAretolistarray(Areto[] aretolistarray) {
		Aretolistarray = aretolistarray;
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
		return Arrays.equals(Aretolistarray, other.Aretolistarray)
				&& Arrays.equals(SaioalistArray, other.SaioalistArray) && Objects.equals(helbidea, other.helbidea)
				&& id_zine == other.id_zine && Objects.equals(izena, other.izena);
	}
	@Override
	public String toString() {
		return "Zinema [id_zine=" + id_zine + ", izena=" + izena + ", helbidea=" + helbidea + ", SaioalistArray="
				+ Arrays.toString(SaioalistArray) + ", Aretolistarray=" + Arrays.toString(Aretolistarray) + "]";
	}

	
	

}
