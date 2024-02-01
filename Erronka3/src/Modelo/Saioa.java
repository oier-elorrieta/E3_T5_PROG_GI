package Modelo;

import java.util.Objects;

public class Saioa {
	private int id_saioa;

	public Saioa(int id_saioa) {
		
		this.id_saioa = id_saioa;
	}

	public int getId_saioa() {
		return id_saioa;
	}

	public void setId_saioa(int id_saioa) {
		this.id_saioa = id_saioa;
	}

	@Override
	public String toString() {
		return "Saioa" + id_saioa + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_saioa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saioa other = (Saioa) obj;
		return id_saioa == other.id_saioa;
	}
	
	
	
}
