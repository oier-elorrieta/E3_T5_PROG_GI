package Modelo;

import java.util.Objects;

public class Areto {
	private int id_areto;
	private String izena;
	private int zinema_id;

	
	public Areto(int id_areto, String izena, int eserlekuak) {
		this.id_areto = id_areto;
		this.izena = izena;

	}

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

	public int getZinema_id() {
		return zinema_id;
	}

	public void setZinema_id(int zinema_id) {
		this.zinema_id = zinema_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_areto, izena, zinema_id);
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
		return id_areto == other.id_areto && Objects.equals(izena, other.izena) && zinema_id == other.zinema_id;
	}

	@Override
	public String toString() {
		return "Areto id_areto" + id_areto + ", izena" + izena + ", zinema_id" + zinema_id;
	}
	
}
