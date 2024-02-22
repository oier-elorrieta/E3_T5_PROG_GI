package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Modelo.Bezeroa;
import Modelo.Zinema;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zinemak extends JFrame {

    private static final long serialVersionUID = 1557861239751784319L;
    private JPanel contentPaneZinemak;
    private Zinema[] zinemakList;
    private Bezeroa[] bezeroak;

    public Zinemak(Zinema[] zinemakList, Bezeroa[] bezeroak) {
        this.zinemakList = zinemakList;
        this.bezeroak = bezeroak; 

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
                    filmakZerrenda(zinemaAukeraID);
                }
            });
            contentPaneZinemak.add(btnCinema);
        }   

        JButton btnAmaitu = new JButton("Amaitu");
        btnAmaitu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
                Logina login = new Logina(zinemakList, bezeroak); 
                login.setVisible(true); 
            }
        });
        contentPaneZinemak.add(btnAmaitu);
    }

    public void filmakZerrenda(String zinemaAukeraID) {
        Zinema zinemaAukera = null;
        for (Zinema zinema : zinemakList) {
            if (zinema.getId_zine().equals(zinemaAukeraID)) {
                zinemaAukera = zinema;
                break;
            }
        }
        if (zinemaAukera != null) {
            Data dataFrame = new Data(zinemaAukera, zinemakList, bezeroak);
            dataFrame.setVisible(true);
            dispose(); 
        } else {
            System.out.println("Ez dago zinema hori");
        }
    }
}
