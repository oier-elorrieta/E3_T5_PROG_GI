package DAO;

import Modelo.Bezeroa;
import Modelo.Zinema;

import java.time.LocalDate;
import java.util.Arrays;

import Modelo.Areto;
import Modelo.Saioa;

public class Main {
	 private KonexioaBD konexioaBD;
	
	public Main() {
		konexioaBD = new KonexioaBD();
    }

    public static void main(String[] args) {
    	
    	
//        ZinemakDAO dao = new ZinemakDAO();
//        Zinema[] zinemaList = dao.getAllZinemak();
//        AretoDAO dao2 = new AretoDAO();
//        Areto[] aretoList = dao2.getAllAretoak();
    	ZinemakDAO zinemaDAO = new ZinemakDAO();
    	Zinema[] zinemak = zinemaDAO.getAllZinemak();
    	Zinema zineUno = zinemak[0]; 
    	System.out.println("ID del Zine: " + zineUno.getSaioalist().toString());
    	for (Saioa saioa : zineUno.getSaioalist()) {
    	    System.out.println(saioa.toString());
    	}

//    	Saioa[] saioakZineUno = zineUno.getSaioalist();

//    	System.out.println("Saioak del Zine Uno desde el 22 de febrero:");
//    	for (Saioa saioa : saioakZineUno) {
//    	    LocalDate fecha = saioa.getDate();
//    	    if (fecha != null && fecha.isAfter(LocalDate.of(2024, 2, 21))) {
//    	        System.out.println("    Saioa id: " + saioa.getOrdua());
//    	        System.out.println("    Saioa data: " + fecha);
//    	        System.out.println("    Película: " + saioa.getFilma().getIzena());
//    	    }
//    	}

//        System.out.println("-----------------------------");
//
//        for (Zinema zinema : zinemaList) {
//            System.out.println("Saioa list array: " + Arrays.toString(zinema.getSaioalist()));
//            System.out.println("Areto list array: " + Arrays.toString(zinema.getAretolist()));
//        }
//        
            
//                ZinemakDAO zinemakDAO = new ZinemakDAO();
//                Zinema[] zinemakList = zinemakDAO.getAllZinemak();
//
//                
//                    Zinema firstCinema = zinemakList[1];
//                    Saioa[] saioak = firstCinema.getSaioalist();
//
//                    System.out.println("Horarios de películas para el primer cine:");
//                    for (Saioa saioa : saioak) {
//                        System.out.println(saioa.getFilma().getIzena() + " - " + saioa.getDate());
//                    }
//                
            
        

 }
}

