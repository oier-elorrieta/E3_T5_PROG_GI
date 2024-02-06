package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Erosketak {

	private int diruTotala;
	Sarrera[] SarreraList = new Sarrera[5];
	private int id_erosketak;

	public Erosketak(int diruTotala, Sarrera[] sarreraList, int id_erosketak) {
		this.diruTotala = diruTotala;
		SarreraList = sarreraList;
		this.id_erosketak = id_erosketak;
	}

	public int getDiruTotala() {
		return diruTotala;
	}

	public void setDiruTotala(int diruTotala) {
		this.diruTotala = diruTotala;
	}

	public Sarrera[] getSarreraList() {
		return SarreraList;
	}

	public void setSarreraList(Sarrera[] sarreraList) {
		SarreraList = sarreraList;
	}

	public int getId_erosketak() {
		return id_erosketak;
	}

	public void setId_erosketak(int id_erosketak) {
		this.id_erosketak = id_erosketak;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Erosketak other = (Erosketak) obj;
		return Arrays.equals(SarreraList, other.SarreraList) && diruTotala == other.diruTotala
				&& id_erosketak == other.id_erosketak;
	}

	@Override
	public String toString() {
		return "Erosketak [diruTotala=" + diruTotala + ", SarreraList=" + Arrays.toString(SarreraList)
				+ ", id_erosketak=" + id_erosketak + "]";
	}

}
