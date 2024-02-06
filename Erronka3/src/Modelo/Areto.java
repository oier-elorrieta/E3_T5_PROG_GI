package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Areto {
	private int id_areto;
	private String izena;
	Saioa[] SaioalistArray = new Saioa[5];
	public int getId_areto() {
		return id_areto;
	}
	public void setId_areto(int id_areto) {
		this.id_areto = id_areto;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public Saioa[] getSaioalistArray() {
		return SaioalistArray;
	}
	public void setSaioalistArray(Saioa[] saioalistArray) {
		SaioalistArray = saioalistArray;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(SaioalistArray);
		result = prime * result + Objects.hash(id_areto, izena);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Areto other = (Areto) obj;
		return Arrays.equals(SaioalistArray, other.SaioalistArray) && id_areto == other.id_areto
				&& Objects.equals(izena, other.izena);
	}
	@Override
	public String toString() {
		return "Areto [id_areto=" + id_areto + ", izena=" + izena + ", SaioalistArray="
				+ Arrays.toString(SaioalistArray) + "]";
	}

	
	
	
}
