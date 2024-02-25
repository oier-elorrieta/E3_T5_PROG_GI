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
import Modelo.Erosketa;
import Modelo.Saioa;
import Modelo.Zinema;

public class FilmakV extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPaneFilmak;
    private Zinema zinemaAukera;
    private Zinema[] zinemakList;
    private Bezeroa bezeroaLog;
    private Date selectedDate;
    private Bezeroa[] bezeroak;

    public FilmakV(Zinema zinemaAukera, Zinema[] zinemakList, Bezeroa bezeroaLog, Date selectedDate, Bezeroa[] bezeroak) {
        this.zinemaAukera = zinemaAukera;
        this.zinemakList = zinemakList;
        this.bezeroaLog = bezeroaLog;
        this.selectedDate = selectedDate;
        this.bezeroak = bezeroak;
        System.out.println(bezeroaLog);
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
            ZinemakV zinemak = new ZinemakV(zinemakList, bezeroaLog,bezeroak);
            zinemak.setVisible(true);
            dispose();
        });
        btnAtzeraFilmak.setBackground(SystemColor.activeCaption);
        btnAtzeraFilmak.setBounds(10, 10, 85, 21);
        contentPaneFilmak.add(btnAtzeraFilmak);

        JComboBox<String> comboBoxMovies = new JComboBox<>();
        comboBoxMovies.setBounds(150, 50, 200, 30);
        contentPaneFilmak.add(comboBoxMovies);

        Set<String> saioakSet = new LinkedHashSet<>();
        for (Saioa saioa : zinemaAukera.getSaioalist()) {
            if (saioa.getDate().isEqual(convertirDateALocalDate(selectedDate))) {
                saioakSet.add(saioa.getFilma().getIzena());
            }
        }

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
        SaioakV saioak = new SaioakV(selectedMovie, zinemakList, bezeroaLog, selectedDate, selectedCinema,bezeroak);
        saioak.setVisible(true);
        dispose();
    }
}
