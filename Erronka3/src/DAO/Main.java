package DAO;

import Modelo.Bezeroa;
import Modelo.Zinema;

import java.util.Arrays;

import Modelo.Areto;
import Modelo.Saioa;

public class Main {
	 private KonexioaBD konexioaBD;
	
	public Main() {
		konexioaBD = new KonexioaBD();
    }

    public static void main(String[] args) {
    	
    	
        ZinemakDAO dao = new ZinemakDAO();
        Zinema[] zinemaList = dao.getAllZinemak();
        AretoDAO dao2 = new AretoDAO();
        Areto[] aretoList = dao2.getAllAretoak();
        SaioaDAO dao3 = new SaioaDAO();
        Saioa[] saioaList = dao3.getAllSaioak();
        
        System.out.println("Saioak:");
        System.out.println("Saioak:");
        for (Saioa saioa : saioaList) {
            System.out.println("    Saioa id: " + saioa.getOrdua());
            System.out.println("    Saioa data: " + saioa.getDate());
        }
        System.out.println("-----------------------------");

        for (Zinema zinema : zinemaList) {
            System.out.println("Saioa list array: " + Arrays.toString(zinema.getSaioalist()));
            System.out.println("Areto list array: " + Arrays.toString(zinema.getAretolist()));
        }

}
    }

