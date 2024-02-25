package Kontroladorea;

import DAO.BezeroaDAO;
import DAO.FilmaDAO;
import DAO.SaioaDAO;
import DAO.ZinemakDAO;
import Modelo.Bezeroa;
import Modelo.Erosketa;
import Modelo.Filma;
import Modelo.Karteldegia;
import Modelo.Saioa;
import Modelo.Zinema;
import Vista.OngiEtorriV;

public class Kontroladorea {

    public static void main(String[] args) {
        ZinemakDAO zinemakDAO = new ZinemakDAO();
        Zinema[] zinemakList = zinemakDAO.getAllZinemak();
        BezeroaDAO bezeroaDAO = new BezeroaDAO();
        Bezeroa[] bezeroak = bezeroaDAO.getAllBezeroak();
        FilmaDAO filmaDAO = new FilmaDAO();
        Filma[] filmak = filmaDAO.getAllFilmak();
        Karteldegia[] karteldegiaArray = new Karteldegia[filmak.length];
        for (int i = 0; i < filmak.length; i++) {
            Karteldegia karteldegia = new Karteldegia(new Filma[]{filmak[i]});
            karteldegiaArray[i] = karteldegia;
        }
        
        try {
            OngiEtorriV frame = new OngiEtorriV(zinemakList,bezeroak);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}