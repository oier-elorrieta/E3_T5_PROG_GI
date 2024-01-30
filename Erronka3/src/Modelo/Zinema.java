package Modelo;

import java.util.Objects;

public class Zinema {
	private int id_zine;
    private String izena;
    private String helbidea;
    
    
	public Zinema(int id_zine, String izena, String helbidea) {
		this.id_zine = id_zine;
		this.izena = izena;
		this.helbidea = helbidea;
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
	@Override
	public String toString() {
		return "Zinema id_zine " + id_zine + ", izena " + izena + ", helbidea " + helbidea + " ";
	}
	@Override
	public int hashCode() {
		return Objects.hash(helbidea, id_zine, izena);
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
		return Objects.equals(helbidea, other.helbidea) && id_zine == other.id_zine
				&& Objects.equals(izena, other.izena);
	}
    
	



}
