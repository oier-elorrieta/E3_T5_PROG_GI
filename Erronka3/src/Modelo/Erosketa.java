package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Erosketa {
    private Bezeroa bezeroa;
    private Sarrera[] sarreraList;
    private int diruTotala;
    private int id_erosketa;

    public Erosketa() {
        this.diruTotala = diruTotala;
        this.sarreraList = sarreraList;
        this.id_erosketa = getId_erosketak();
    }

    public Bezeroa getBezeroa() {
        return bezeroa;
    }

    public void setBezeroa(Bezeroa bezeroa) {
        this.bezeroa = bezeroa;
    }

    public int getDiruTotala() {
        return diruTotala;
    }

    public void setDiruTotala(int diruTotala) {
        this.diruTotala = diruTotala;
    }

    public Sarrera[] getSarreraList() {
        return sarreraList;
    }

    public void setSarreraList(Sarrera[] sarreraList) {
        this.sarreraList = sarreraList;
    }

    public int getId_erosketak() {
        return id_erosketa;
    }

    public void setId_erosketak(int id_erosketak) {
        this.id_erosketa = id_erosketak;
    }

    @Override
    public String toString() {
        return "Erosketa [bezeroa=" + bezeroa + ", sarreraList=" + Arrays.toString(sarreraList) + ", diruTotala="
                + diruTotala + ", id_erosketa=" + id_erosketa + "]";
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
                && diruTotala == other.diruTotala && id_erosketa == other.id_erosketa;
    }

}
