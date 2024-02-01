package Modelo;

import java.util.Objects;

public class Sarrera {
	private int id_sarrera;
	private double prezioa;


	public int getId_sarrera() {
		return id_sarrera;
	}


	public void setId_sarrera(int id_sarrera) {
		this.id_sarrera = id_sarrera;
	}


	public double getPrezioa() {
		return prezioa;
	}


	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}


	public Sarrera(int id_sarrera, double prezioa) {
		this.id_sarrera = id_sarrera;
		this.prezioa = prezioa;
	}
	
	@Override
	public String toString() {
		return "Sarrera" + id_sarrera + ", prezioa" + prezioa + "";
		
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_sarrera, prezioa);
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
		return id_sarrera == other.id_sarrera
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
	}
	
}
