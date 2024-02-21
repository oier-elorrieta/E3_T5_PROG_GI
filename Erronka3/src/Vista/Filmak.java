package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import DAO.KonexioaBD;
import Modelo.Kontsultak;
import Modelo.Zinema;
import Modelo.Filma;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Filmak extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPaneFilmak;
    private String selectedZinema;

    public Filmak(String selectedZinema) {
        this.selectedZinema = selectedZinema;
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
                Zinemak zinemak = new Zinemak();
                zinemak.setVisible(true);
                dispose();
            }
        });
        btnAtzeraFilmak.setBackground(SystemColor.activeCaption);
        btnAtzeraFilmak.setBounds(10, 10, 85, 21);
        contentPaneFilmak.add(btnAtzeraFilmak);
        
       Kontsultak kontsulta = new Kontsultak();

        String[] filmakZinema = kontsulta.FilmakZinema(selectedZinema);
        int i;
        if (filmakZinema != null) {
            for (i = 0; i < filmakZinema.length; i++) {
               // final int index = i;
             //   JButton btnPelikula = new JButton(filmakZinema[i]);
//                btnPelikula.addActionListener(new ActionListener() {
//                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Has seleccionado la película: " + filmakZinema[i]);
//                        Saioak saioa = new Saioak(filmakZinema[index]);  // Utiliza el nombre de la película como parámetro
//                        saioa.setVisible(true);
//                        dispose();
//                    }
//                });
             //   btnPelikula.setBounds(10, 50 + i * 30, 150, 25);
              //  contentPaneFilmak.add(btnPelikula);
            }
        }
}
}

