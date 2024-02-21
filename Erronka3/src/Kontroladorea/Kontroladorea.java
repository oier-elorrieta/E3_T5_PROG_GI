package Kontroladorea;

import DAO.SaioaDAO;
import DAO.ZinemakDAO;
import Modelo.Saioa;
import Modelo.Zinema;
import Vista.OngiEtorri;

public class Kontroladorea {

    public static void main(String[] args) {
        ZinemakDAO zinemakDAO = new ZinemakDAO();
        SaioaDAO  saioaDAO = new SaioaDAO();
        Zinema[] zinemakList = zinemakDAO.getAllZinemak();
        Saioa[] saioaList = saioaDAO.getAllSaioak();
    
        try {
            OngiEtorri frame = new OngiEtorri(zinemakList, saioaList);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}