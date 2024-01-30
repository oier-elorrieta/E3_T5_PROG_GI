package Modelo;

import java.util.Objects;

public class Bezeroa {
	private String izena;
	private String erabiltzailea;
	private String nan;
	private char sexua;
	private String email;
	private String pasahitza;
	
	public Bezeroa(String izena, String erabiltzailea, String nan, char sexua, String email, String pasahitza) {
		this.izena = izena;
		this.erabiltzailea = erabiltzailea;
		this.nan = nan;
		this.sexua = sexua;
		this.email = email;
		this.pasahitza = pasahitza;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getErabiltzailea() {
		return erabiltzailea;
	}
	public void setErabiltzailea(String erabiltzailea) {
		this.erabiltzailea = erabiltzailea;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasahitza() {
		return pasahitza;
	}
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}
	@Override
	public String toString() {
		return "Bezeroa izena " + izena + ", erabiltzailea " + erabiltzailea + ", nan " + nan + ", sexua " + sexua
				+ ", email " + email + ", pasahitza " + pasahitza + " ";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, erabiltzailea, izena, nan, pasahitza, sexua);
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
		return Objects.equals(email, other.email) && Objects.equals(erabiltzailea, other.erabiltzailea)
				&& Objects.equals(izena, other.izena) && Objects.equals(nan, other.nan)
				&& Objects.equals(pasahitza, other.pasahitza) && sexua == other.sexua;
	}
	
	
	
	
	
}
