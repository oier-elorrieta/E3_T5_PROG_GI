package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Sarrera {
	private String mota;
	Saioa[] SaioalistArray = new Saioa[5];

	public Sarrera(String mota, Saioa[] saioalistArray) {
		this.mota = mota;
		SaioalistArray = saioalistArray;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public Saioa[] getSaioalistArray() {
		return SaioalistArray;
	}

	public void setSaioalistArray(Saioa[] saioalistArray) {
		SaioalistArray = saioalistArray;
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
		return Arrays.equals(SaioalistArray, other.SaioalistArray) && Objects.equals(mota, other.mota);
	}

	@Override
	public String toString() {
		return "Sarrera [mota=" + mota + ", SaioalistArray=" + Arrays.toString(SaioalistArray) + "]";
	}

}