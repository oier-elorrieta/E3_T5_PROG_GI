package Modelo;

import java.util.Objects;

public class Areto {
    private String id_areto;
    private String izena;
    private String zinema; // Agregar el campo Zinema

    public Areto(String areto_id, String izena, String zinema_id) {
        this.id_areto = areto_id;
        this.izena = izena;
        this.zinema = zinema_id;
    }

    public String getId_areto() {
        return id_areto;
    }

    public void setId_areto(String id_areto) {
        this.id_areto = id_areto;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getZinema() { // Agregar el getter para Zinema
        return zinema;
    }

    public void setZinema(String zinema) { // Agregar el setter para Zinema
        this.zinema = zinema;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_areto, izena);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Areto other = (Areto) obj;
        return id_areto == other.id_areto && Objects.equals(izena, other.izena);
    }

    @Override
    public String toString() {
        return "Areto id_areto " + id_areto + ", izena " + izena + "";
    }
}
