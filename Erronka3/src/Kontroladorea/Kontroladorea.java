package Kontroladorea;

import DAO.SaioaDAO;
import DAO.ZinemakDAO;
import Modelo.Saioa;
import Modelo.Zinema;
import Vista.OngiEtorri;

public class Kontroladorea {

    public static void main(String[] args) {
        ZinemakDAO zinemakDAO = new ZinemakDAO();
        Zinema[] zinemakList = zinemakDAO.getAllZinemak();
    
        try {
            OngiEtorri frame = new OngiEtorri(zinemakList);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}