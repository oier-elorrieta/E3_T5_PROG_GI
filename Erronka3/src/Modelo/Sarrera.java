package Modelo;

import java.util.Objects;

public class Sarrera {
	private int id_sarrera;
	private int id_erosketak;
	private int id_saioa;

	public int getId_sarrera() {
		return id_sarrera;
	}

	public void setId_sarrera(int id_sarrera) {
		this.id_sarrera = id_sarrera;
	}

	public int getId_erosketak() {
		return id_erosketak;
	}

	public void setId_erosketak(int id_erosketak) {
		this.id_erosketak = id_erosketak;
	}

	public int getId_saioa() {
		return id_saioa;
	}

	public void setId_saioa(int id_saioa) {
		this.id_saioa = id_saioa;
	}

	@Override
	public String toString() {
		return "Sarrera [id_sarrera=" + id_sarrera + ", id_erosketak=" + id_erosketak + ", id_saioa=" + id_saioa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_erosketak, id_saioa, id_sarrera);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sarrera other = (Sarrera) obj;
		return id_erosketak == other.id_erosketak && id_saioa == other.id_saioa && id_sarrera == other.id_sarrera;
	}
}