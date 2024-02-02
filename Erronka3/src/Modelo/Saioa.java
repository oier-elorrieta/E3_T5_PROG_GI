package Modelo;

import java.util.Objects;

public class Saioa {
	private int id_saioa;
	private int ordua;

	public Saioa(int id_saioa) {

		this.id_saioa = id_saioa;
	}

	public int getId_saioa() {
		return id_saioa;
	}

	public void setId_saioa(int id_saioa) {
		this.id_saioa = id_saioa;
	}

	public int getOrdua() {
		return ordua;
	}

	public void setOrdua(int ordua) {
		this.ordua = ordua;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_saioa, ordua);
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
		return id_saioa == other.id_saioa && ordua == other.ordua;
	}

	@Override
	public String toString() {
		return "Saioa [id_saioa=" + id_saioa + ", ordua=" + ordua + "]";
	}

}
