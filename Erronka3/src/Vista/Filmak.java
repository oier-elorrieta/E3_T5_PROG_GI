package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import Modelo.Bezeroa;
import Modelo.Saioa;
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
        this.selectedDate = selectedDate;
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
        btnAtzeraFilmak.addActionListener(e -> {
            Zinemak zinemak = new Zinemak(zinemakList, bezeroak);
            zinemak.setVisible(true);
            dispose();
        });
        btnAtzeraFilmak.setBackground(SystemColor.activeCaption);
        btnAtzeraFilmak.setBounds(10, 10, 85, 21);
        contentPaneFilmak.add(btnAtzeraFilmak);

        JComboBox<String> comboBoxMovies = new JComboBox<>();
        comboBoxMovies.setBounds(150, 50, 200, 30);
        contentPaneFilmak.add(comboBoxMovies);

        // Utiliza un LinkedHashSet para mantener el orden de inserción y evitar saioak duplicadas
        Set<String> saioakSet = new LinkedHashSet<>();
        for (Saioa saioa : zinemaAukera.getSaioalist()) {
            if (saioa.getDate().isEqual(convertirDateALocalDate(selectedDate))) {
                saioakSet.add(saioa.getFilma().getIzena());
            }
        }
        // Agregar nombres de películas al JComboBox
        for (String movieName : saioakSet) {
            comboBoxMovies.addItem(movieName);
        }

        comboBoxMovies.addActionListener(e -> {
            String selectedMovie = comboBoxMovies.getSelectedItem().toString();
            abrirVentanaSaioak(selectedMovie, zinemaAukera);
        });
    }

    private LocalDate convertirDateALocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    private void abrirVentanaSaioak(String selectedMovie, Zinema selectedCinema) {
        Saioak saioak = new Saioak(selectedMovie, zinemakList, bezeroak, selectedDate, selectedCinema);
        saioak.setVisible(true);
        dispose();
    }
}
