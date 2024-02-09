package Modelo;

import java.util.Objects;

public class Bezeroa {
	private String izena;
	private String abizena;
	private String nan;
	private char sexua;
	private String pasahitza;

	public Bezeroa(String izena, String abizena, String nan, char sexua, String pasahitza) {
		this.izena = izena;
		this.abizena = abizena;
		this.nan = nan;
		this.sexua = sexua;
		this.pasahitza = pasahitza;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public char getSexua() {
		return sexua;
	}

	public void setSexua(char sexua) {
		this.sexua = sexua;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	@Override
	public int hashCode() {
		return Objects.hash(abizena, izena, nan, pasahitza, sexua);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bezeroa other = (Bezeroa) obj;
		return Objects.equals(abizena, other.abizena) && Objects.equals(izena, other.izena)
				&& Objects.equals(nan, other.nan) && Objects.equals(pasahitza, other.pasahitza) && sexua == other.sexua;
	}

	@Override
	public String toString() {
		return "Bezeroa izena" + izena + ", abizena" + abizena + ", nan" + nan + ", sexua" + sexua + ", pasahitza"
				+ pasahitza;
	}

}
