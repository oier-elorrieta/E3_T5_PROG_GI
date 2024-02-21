package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import DAO.ZinemakDAO;
import Kontroladorea.Kontroladorea;
import Modelo.Saioa;
import Modelo.Zinema;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zinemak extends JFrame {

    private static final long serialVersionUID = 1557861239751784319L;
    private JPanel contentPaneZinemak;
    public String selectedZinema;
    

    public Zinemak(Zinema[] zinemakList, Saioa[] saioaList) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneZinemak = new JPanel();
        contentPaneZinemak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneZinemak);
        contentPaneZinemak.setLayout(new GridLayout(0, 1, 0, 10));
        
        
        if (zinemakList != null) {
            for (Zinema zinema : zinemakList) {
                if (zinema != null) { 
                    JButton btnCinema = new JButton(zinema.getIzena());
                    btnCinema.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            selectedZinema = zinema.getId_zine();
                            System.out.println(selectedZinema);
                            FilmakAtala();
                            
                        }
                    });
                    contentPaneZinemak.add(btnCinema);
                }
            }
        }

        JButton btnAmaitu = new JButton("Amaitu");
        btnAmaitu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OngiEtorri ongiEtorri = new OngiEtorri(zinemakList,saioaList);
                ongiEtorri.setVisible(true);
            }
        });
        contentPaneZinemak.add(btnAmaitu);
    }

    public void FilmakAtala() {
        Filmak filmak = new Filmak(selectedZinema);
        filmak.setVisible(true);
        dispose();
    }
}
