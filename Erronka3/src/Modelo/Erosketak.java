package Modelo;

import java.util.Objects;

public class Erosketak {
	
	private int diruTotala;
	private int kantitatea;
	private int id_erosketak;
	private int id_bezeroa;
	public int getDiruTotala() {
		return diruTotala;
	}
	public void setDiruTotala(int diruTotala) {
		this.diruTotala = diruTotala;
	}
	public int getKantitatea() {
		return kantitatea;
	}
	public void setKantitatea(int kantitatea) {
		this.kantitatea = kantitatea;
	}
	public int getId_erosketak() {
		return id_erosketak;
	}
	public void setId_erosketak(int id_erosketak) {
		this.id_erosketak = id_erosketak;
	}
	public int getId_bezeroa() {
		return id_bezeroa;
	}
	public void setId_bezeroa(int id_bezeroa) {
		this.id_bezeroa = id_bezeroa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(diruTotala, id_bezeroa, id_erosketak, kantitatea);
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
		return diruTotala == other.diruTotala && id_bezeroa == other.id_bezeroa && id_erosketak == other.id_erosketak
				&& kantitatea == other.kantitatea;
	}
	@Override
	public String toString() {
		return "Erosketak diruTotala" + diruTotala + ", kantitatea" + kantitatea + ", id_erosketak" + id_erosketak
				+ ", id_bezeroa" + id_bezeroa;
	}
	

}
