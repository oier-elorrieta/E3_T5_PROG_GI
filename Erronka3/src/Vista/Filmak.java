package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import Modelo.Bezeroa;
import Modelo.Zinema;

public class Filmak extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPaneFilmak;
    private Zinema zinemaAukera;
    private Zinema[] zinemakList;
    private Bezeroa[] bezeroak;
    private Date selectedDate; 

    public Filmak(Zinema zinemaAukera, Zinema[] zinemakList, Bezeroa[] bezeroak, Date selectedDate) {
        this.zinemaAukera = zinemaAukera;
        this.zinemakList = zinemakList;
        this.bezeroak = bezeroak;
        this.selectedDate = selectedDate; // Asignar la fecha seleccionada
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
                Zinemak zinemak = new Zinemak(zinemakList, bezeroak);
                zinemak.setVisible(true);
                dispose();
            }
        });
        btnAtzeraFilmak.setBackground(SystemColor.activeCaption);
        btnAtzeraFilmak.setBounds(10, 10, 85, 21);
        contentPaneFilmak.add(btnAtzeraFilmak);

        String[] closestMovies = zinemaAukera.getClosestMovies(zinemaAukera.getSaioalist());
        JComboBox<String> comboBoxMovies = new JComboBox<>(closestMovies);
        comboBoxMovies.setBounds(10, 50, 150, 25);
        contentPaneFilmak.add(comboBoxMovies);

        comboBoxMovies.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedMovie = (String) comboBoxMovies.getSelectedItem();
                if (selectedMovie != null) {
                    abrirVentanaSaioak(selectedMovie);
                }
            }
        });
    }

    private void abrirVentanaSaioak(String selectedMovie) {
        Saioak saioak = new Saioak(selectedMovie, zinemakList, bezeroak, selectedDate);
        saioak.setVisible(true);
        dispose();
    }
}
