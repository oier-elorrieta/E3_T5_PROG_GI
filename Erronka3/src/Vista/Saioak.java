package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;


import Modelo.Bezeroa;
import Modelo.Filma;
import Modelo.Saioa;
import Modelo.Zinema;
import java.awt.Font;

public class Saioak extends JFrame {
    private Zinema zinemaAukera;
    private JPanel contentPaneSaioak;
    private JLabel lblHorarios;
    private Date selectedDate;
<<<<<<< HEAD
    
    
    public Saioak(String selectedMovie, Zinema[] zinemakList, Bezeroa[] bezeroak,Date selectedDate) {
=======

    public Saioak(String selectedMovie, Zinema[] zinemakList, Bezeroa[] bezeroak, Date selectedDate) {
>>>>>>> d2420ec5301b84f7c65428cf8ab074b9015623c5
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneSaioak = new JPanel();
        contentPaneSaioak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneSaioak);

        JButton btnAtzeraSaioak = new JButton("Atzera");
        btnAtzeraSaioak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
                Filmak filmak = new Filmak(zinemaAukera,zinemakList,bezeroak,selectedDate);
=======
                Filmak filmak = new Filmak(zinemaAukera, zinemakList, bezeroak, selectedDate);
>>>>>>> d2420ec5301b84f7c65428cf8ab074b9015623c5
                filmak.setVisible(true);
                dispose();
            }
        });
        btnAtzeraSaioak.setBounds(10, 10, 79, 29);
        contentPaneSaioak.setLayout(null);
        contentPaneSaioak.add(btnAtzeraSaioak);

<<<<<<< HEAD
        lblData = new JLabel("Ordutegia");
        lblData.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblData.setBounds(10, 172, 286, 21);
        contentPaneSaioak.add(lblData);
        
        
=======
        lblHorarios = new JLabel("Ordutegia");
        lblHorarios.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblHorarios.setBounds(160, 20, 100, 30); // Ajustar posición para centrarlo
        contentPaneSaioak.add(lblHorarios);
>>>>>>> d2420ec5301b84f7c65428cf8ab074b9015623c5

        Filma filmaAukera = filmakZerrenda(selectedMovie, zinemakList);

        JLabel lblfilmaIzena = new JLabel(filmaAukera.getIzena());
        lblfilmaIzena.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblfilmaIzena.setBounds(10, 50, 350, 39); // Ajustar tamaño y posición
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

        // Lógica para agregar elementos al JComboBox
        for (Zinema zinema : zinemakList) {
            for (Saioa saioa : zinema.getSaioalist()) {
                if (saioa.getFilma().getIzena().equals(selectedMovie)) {
                    String saioaInfo = "Hora: " + saioa.getOrdua() + " - Fecha: " + saioa.getDate();
                    saioakComboBox.addItem(saioaInfo);
                }
            }
<<<<<<< HEAD
        });

        // Crear el picker de fecha con DateComponentFormatter
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        datePicker.getJFormattedTextField().setBounds(0, 0, 122, 21);
        datePicker.setBounds(132, 20, 150, 30);
        contentPaneSaioak.add(datePicker);
        datePicker.setLayout(null);
  
       Filma filmaAukera = filmakZerrenda(selectedMovie,zinemakList);

        
        JLabel lblfilmaIzena = new JLabel(filmaAukera.getIzena());
        lblfilmaIzena.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblfilmaIzena.setBounds(108, 67, 234, 39);
        contentPaneSaioak.add(lblfilmaIzena);
        
        int iraupena = filmaAukera.getIraupena();        
        String filmaIraupena = "";
        
        filmaIraupena = iraupena + filmaIraupena;
        
        JLabel lblIraupena = new JLabel(filmaIraupena +" minutu irauten du");
        lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblIraupena.setBounds(10, 92, 174, 30);
        contentPaneSaioak.add(lblIraupena);
        
        JLabel lblGeneroa = new JLabel("Generoa: " +filmaAukera.getGeneroa());
        lblGeneroa.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblGeneroa.setBounds(10, 132, 144, 21);
        contentPaneSaioak.add(lblGeneroa);
=======
        }
>>>>>>> d2420ec5301b84f7c65428cf8ab074b9015623c5
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
