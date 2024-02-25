package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zinema {
    private String id_zine;
    private String izena;
    private String helbidea;
    private Saioa[] saioalist;
    private Areto[] aretolist;

    public Zinema(String id_zine, String izena, String helbidea, Saioa[] saioalist, Areto[] aretolist) {
        this.id_zine = id_zine;
        this.izena = izena;
        this.helbidea = helbidea;
        this.saioalist = saioalist;
        this.aretolist = aretolist;
    }
    
    public String getId_zine() {
        return id_zine;
    }

    public void setId_zine(String id_zine) {
        this.id_zine = id_zine;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getHelbidea() {
        return helbidea;
    }

    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

    public Saioa[] getSaioalist() {
        return saioalist;
    }

    public void setSaioalist(Saioa[] saioalist) {
        this.saioalist = saioalist;
    }

    public Areto[] getAretolist() {
        return aretolist;
    }

    public void setAretolist(Areto[] aretolist) {
        this.aretolist = aretolist;
    }

  

    @Override
    public String toString() {
        return "Zinema id_zine " + id_zine + ", izena " + izena + ", helbidea " + helbidea + ", Saioalist " + saioalist + ", Aretolist " + aretolist;
    }



	
}
