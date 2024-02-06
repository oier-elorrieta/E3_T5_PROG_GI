package Modelo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

import org.jdatepicker.JDatePicker;

public class Saioa {
	private int id_saioa;
	private LocalDate ordua;
	private JDatePicker jDatePicker;
	Karteldegia[] karteldegiaList = new Karteldegia[5];
	Areto[] AretoaList = new Areto[5];
	public Saioa(int id_saioa, LocalDate ordua, JDatePicker jDatePicker, Karteldegia[] karteldegiaList,
			Areto[] aretoaList) {

		this.id_saioa = id_saioa;
		this.ordua = ordua;
		this.jDatePicker = jDatePicker;
		this.karteldegiaList = karteldegiaList;
		AretoaList = aretoaList;
	}
	public Saioa(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public int getId_saioa() {
		return id_saioa;
	}
	public void setId_saioa(int id_saioa) {
		this.id_saioa = id_saioa;
	}
	public LocalDate getOrdua() {
		return ordua;
	}
	public void setOrdua(LocalDate ordua) {
		this.ordua = ordua;
	}
	public JDatePicker getjDatePicker() {
		return jDatePicker;
	}
	public void setjDatePicker(JDatePicker jDatePicker) {
		this.jDatePicker = jDatePicker;
	}
	public Karteldegia[] getKarteldegiaList() {
		return karteldegiaList;
	}
	public void setKarteldegiaList(Karteldegia[] karteldegiaList) {
		this.karteldegiaList = karteldegiaList;
	}
	public Areto[] getAretoaList() {
		return AretoaList;
	}
	public void setAretoaList(Areto[] aretoaList) {
		AretoaList = aretoaList;
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
		return Arrays.equals(AretoaList, other.AretoaList) && id_saioa == other.id_saioa
				&& Objects.equals(jDatePicker, other.jDatePicker)
				&& Arrays.equals(karteldegiaList, other.karteldegiaList) && Objects.equals(ordua, other.ordua);
	}
	@Override
	public String toString() {
		return "Saioa [id_saioa=" + id_saioa + ", ordua=" + ordua + ", jDatePicker=" + jDatePicker
				+ ", karteldegiaList=" + Arrays.toString(karteldegiaList) + ", AretoaList="
				+ Arrays.toString(AretoaList) + "]";
	}

	

}
