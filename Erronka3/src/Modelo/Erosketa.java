package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Erosketa {
    private Bezeroa bezeroa;
    private Sarrera[] sarreraList;
    private double diruTotala;
    private int erosketa_id;

    public Erosketa(Sarrera[] sarreraList, double diruTotala, Bezeroa bezeroa,int erosketa_id) {
    	this.bezeroa = bezeroa;
        this.diruTotala = diruTotala;
        this.sarreraList = sarreraList;
        this.erosketa_id = erosketa_id;
    }

    public Erosketa(Sarrera[] sarrerak, Bezeroa bezeroaLog) {
		
    }

	public Bezeroa getBezeroa() {
        return bezeroa;
    }

    public void setBezeroa(Bezeroa bezeroa) {
        this.bezeroa = bezeroa;
    }

    public double getDiruTotala() {
        return diruTotala;
    }

    public void setDiruTotala(double diruTotala) {
        this.diruTotala = diruTotala;
    }

    public Sarrera[] getSarreraList() {
        return sarreraList;
    }

    public void setSarreraList(Sarrera[] sarreraList) {
        this.sarreraList = sarreraList;
    }

    public int getId_erosketak() {
        return erosketa_id;
    }

    public void setId_erosketak(int id_erosketak) {
        this.erosketa_id = id_erosketak;
    }

    @Override
    public String toString() {
        return "Erosketa [bezeroa=" + bezeroa + ", sarreraList=" + Arrays.toString(sarreraList) + ", diruTotala="
                + diruTotala + ", id_erosketa=" + erosketa_id + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Erosketa other = (Erosketa) obj;
        return Arrays.equals(sarreraList, other.sarreraList) && Objects.equals(bezeroa, other.bezeroa)
                && diruTotala == other.diruTotala && erosketa_id == other.erosketa_id;
    }

}
