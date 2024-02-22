package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Modelo.Zinema;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Filmak extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPaneFilmak;
    private Zinema zinemaAukera;
    private Zinema[] zinemakList;
    private JComboBox<String> comboBoxMovies;

    public Filmak(Zinema zinemaAukera, Zinema[] zinemakList) {
        this.zinemaAukera = zinemaAukera;
        this.zinemakList = zinemakList;
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneFilmak = new JPanel();
        contentPaneFilmak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneFilmak);
        contentPaneFilmak.setLayout(null);

        JButton btnAtzeraFilmak = new JButton("Atzera");
        btnAtzeraFilmak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Zinemak zinemak = new Zinemak(zinemakList);
                zinemak.setVisible(true);
                dispose();
            }
        });
        btnAtzeraFilmak.setBackground(SystemColor.activeCaption);
        btnAtzeraFilmak.setBounds(10, 10, 85, 21);
        contentPaneFilmak.add(btnAtzeraFilmak);

        String[] closestMovies = zinemaAukera.getClosestMovies(zinemaAukera.getSaioalistArray());
        comboBoxMovies = new JComboBox<>(closestMovies);
        comboBoxMovies.setBounds(10, 50, 150, 25);
        contentPaneFilmak.add(comboBoxMovies);

        comboBoxMovies.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedMovie = (String) comboBoxMovies.getSelectedItem();
                if (selectedMovie != null) {
                    System.out.println("Has seleccionado la película: " + selectedMovie);
                    abrirVentanaSaioak(selectedMovie);
                }
            }
        });
    }

    private void abrirVentanaSaioak(String selectedMovie) {
        Saioak saioak = new Saioak(selectedMovie, zinemakList);
        saioak.setVisible(true);
        dispose();
    }
}
