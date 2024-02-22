package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import Modelo.Bezeroa;
import Modelo.Filma;
import Modelo.Saioa;
import Modelo.Zinema;
import java.awt.Font;

public class Saioak extends JFrame {
    private Zinema zinemaAukera;
    private JPanel contentPaneSaioak;
    private JLabel lblHorarios;
    public Saioak(String selectedMovie, Zinema[] zinemakList, Bezeroa[] bezeroak, Date selectedDate, Zinema selectedCinema) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneSaioak = new JPanel();
        contentPaneSaioak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneSaioak);

        JButton btnAtzeraSaioak = new JButton("Atzera");
        btnAtzeraSaioak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Filmak filmak = new Filmak(selectedCinema, zinemakList,  bezeroak, selectedDate);
                filmak.setVisible(true);
                dispose();
            }
        });
        btnAtzeraSaioak.setBounds(10, 10, 79, 29);
        contentPaneSaioak.setLayout(null);
        contentPaneSaioak.add(btnAtzeraSaioak);

        lblHorarios = new JLabel("Ordutegia");
        lblHorarios.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblHorarios.setBounds(160, 20, 100, 30); 
        contentPaneSaioak.add(lblHorarios);

        Filma filmaAukera = filmakZerrenda(selectedMovie, zinemakList);

        JLabel lblfilmaIzena = new JLabel(filmaAukera.getIzena());
        lblfilmaIzena.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblfilmaIzena.setBounds(10, 50, 350, 39); 
        contentPaneSaioak.add(lblfilmaIzena);

        int iraupena = filmaAukera.getIraupena();
        String filmaIraupena = iraupena + " minutos";

        JLabel lblIraupena = new JLabel(filmaIraupena);
        lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblIraupena.setBounds(10, 90, 100, 30);
        contentPaneSaioak.add(lblIraupena);

        JLabel lblGeneroa = new JLabel("Género: " + filmaAukera.getGeneroa());
        lblGeneroa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGeneroa.setBounds(10, 128, 144, 21);
        contentPaneSaioak.add(lblGeneroa);

        JLabel lblDuracion = new JLabel("Duración: " + filmaAukera.getIraupena() + " minutos");
        lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDuracion.setBounds(10, 160, 144, 21);
        contentPaneSaioak.add(lblDuracion);

        JLabel lblPelicula = new JLabel("Película: " + filmaAukera.getIzena());
        lblPelicula.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPelicula.setBounds(10, 186, 144, 21);
        contentPaneSaioak.add(lblPelicula);

        JLabel lblPrecio = new JLabel("Precio: " + filmaAukera.getPrezioa() + " €");
        lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPrecio.setBounds(10, 218, 144, 21);
        contentPaneSaioak.add(lblPrecio);

        JComboBox<String> saioakComboBox = new JComboBox<>();
        saioakComboBox.setBounds(160, 143, 264, 59);
        contentPaneSaioak.add(saioakComboBox);

   
        Set<String> saioakSet = new HashSet<>();

        LocalDate selectedLocalDate = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        for (Zinema zinema : zinemakList) {
            for (Saioa saioa : zinema.getSaioalist()) {
                if (saioa.getFilma().getIzena().equals(selectedMovie)) {
                    LocalDate saioaLocalDate = saioa.getDate();

                    if (!saioaLocalDate.isBefore(selectedLocalDate)) {
                        String saioaInfo = "Hora: " + saioa.getOrdua() + " - Fecha: " + saioa.getDate();
                     
                        if (saioakSet.add(saioaInfo)) {
                            saioakComboBox.addItem(saioaInfo);
                        }
                    }
                }
            }
        }
    }
 
	
	public Filma filmakZerrenda(String selectedMovie, Zinema[] zinemakList) {
        Filma filmaAukera = null;
        for (Zinema zinema : zinemakList) {
            Saioa[] saioalist = zinema.getSaioalist();
            for (Saioa saioa : saioalist) {
                if (saioa.getFilma().getIzena().equals(selectedMovie)) {
                    filmaAukera = saioa.getFilma();
                    break;
                }
            }
        }
        return filmaAukera;
    }
}
