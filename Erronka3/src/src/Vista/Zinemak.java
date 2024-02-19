package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import DAO.ZinemakDAO;
import Modelo.Zinema;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zinemak extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1557861239751784319L;
	private JPanel contentPaneZinemak;

    public Zinemak() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneZinemak = new JPanel();
        contentPaneZinemak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneZinemak);
        contentPaneZinemak.setLayout(new GridLayout(0, 1, 0, 10)); // Use a grid layout to arrange buttons vertically

        // Use ZinemakDAO to get cinema names
        ZinemakDAO zinemakDAO = new ZinemakDAO();
        Zinema[] zinemakList = zinemakDAO.getAllZinemak();

        // If zinemakList is not null, create buttons for each cinema
        if (zinemakList != null) {
            for (Zinema zinema : zinemakList) {
                if (zinema != null) { // Check if zinema is not null
                    JButton btnCinema = new JButton(zinema.getIzena()); // Assuming getIzena() returns cinema name
                    btnCinema.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            String aukeratuZinema = zinema.getIzena(); // Assuming getIzena() returns cinema name
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
                OngiEtorri ongiEtorri = new OngiEtorri();
                ongiEtorri.setVisible(true);
            }
        });
        contentPaneZinemak.add(btnAmaitu);
    }

    public void FilmakAtala() {
        Filmak filmak = new Filmak();
        filmak.setVisible(true);
        dispose();
    }
}
