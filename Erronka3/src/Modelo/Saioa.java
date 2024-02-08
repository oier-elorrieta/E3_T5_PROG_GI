package Modelo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

import org.jdatepicker.JDatePicker;

public class Saioa {
	private LocalDate ordua;
	private LocalDate date;
	Filmak filma;
	Areto Aretoa;

	public Saioa(LocalDate ordua, LocalDate date, Filmak filma, Areto aretoa) {
		this.ordua = ordua;
		this.date = date;
		this.filma = filma;
		Aretoa = aretoa;
	}

	public LocalDate getOrdua() {
		return ordua;
	}

	public void setOrdua(LocalDate ordua) {
		this.ordua = ordua;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Filmak getFilma() {
		return filma;
	}

	public void setFilma(Filmak filma) {
		this.filma = filma;
	}

	public Areto getAretoa() {
		return Aretoa;
	}

	public void setAretoa(Areto aretoa) {
		Aretoa = aretoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Aretoa, date, filma, ordua);
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
		return Objects.equals(Aretoa, other.Aretoa) && Objects.equals(date, other.date)
				&& Objects.equals(filma, other.filma) && Objects.equals(ordua, other.ordua);
	}

	@Override
	public String toString() {
		return "Saioa [ordua=" + ordua + ", date=" + date + ", filma=" + filma + ", Aretoa=" + Aretoa + "]";
	}

}
