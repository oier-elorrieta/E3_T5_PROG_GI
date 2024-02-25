package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Modelo.Areto;
import Modelo.Bezeroa;
import Modelo.Erosketa;
import Modelo.Saioa;
import Modelo.Zinema;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZinemakV extends JFrame {

    private static final long serialVersionUID = 1557861239751784319L;
    private JPanel contentPaneZinemak;
    private Zinema[] zinemakList;
    private Bezeroa[] bezeroak;
    private Bezeroa bezeroaLog;
    
    public ZinemakV(Zinema[] zinemakList, Bezeroa bezeroaLog) {
        this.zinemakList = zinemakList;
        this.bezeroak = bezeroak; 
        this.bezeroaLog = bezeroaLog;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneZinemak = new JPanel();
        contentPaneZinemak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneZinemak);
        contentPaneZinemak.setLayout(new GridLayout(0, 1, 0, 10));

        for (Zinema zinema : zinemakList) {
            JButton btnCinema = new JButton(zinema.getIzena());
            btnCinema.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String zinemaAukeraID = zinema.getId_zine();
                    System.out.println(zinemaAukeraID);
                    zinemaAukeratu(zinemaAukeraID);
                }
            });
            contentPaneZinemak.add(btnCinema);
        }   

        JButton btnAmaitu = new JButton("Amaitu");
        btnAmaitu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                LoginaV login = new LoginaV(zinemakList, bezeroak); 
                login.setVisible(true); 
            }
        });
        contentPaneZinemak.add(btnAmaitu);
    }

    public void zinemaAukeratu(String zinemaAukeraID) {
        Zinema zinemaAukera = null;
        for (Zinema zinema : zinemakList) {
            if (zinema.getId_zine().equals(zinemaAukeraID)) {
                zinemaAukera = zinema;
//                Saioa[] saioaList = zinema.getSaioalist();
//                for (Saioa saioa : saioaList) {
//                    System.out.println("Saioa: " + saioa);
//                    Areto areto = saioa.getAretoa();
//                    System.out.println("Areto: " + areto);
//                }
                for (Areto areto : zinema.getAretolist()) {
                    System.out.println("Areto: " + areto);
                }

                break;
            }
        }
        
            DataV dataFrame = new DataV(zinemaAukera, zinemakList, bezeroaLog);
            dataFrame.setVisible(true);
            dispose();  
    }
}
