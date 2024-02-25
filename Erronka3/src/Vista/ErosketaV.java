package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import DAO.BezeroaDAO;
import DAO.ErosketaDAO;
import Kontroladorea.Kontroladorea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Modelo.Sarrera;
import Modelo.Zinema;
import Modelo.Areto;
import Modelo.Bezeroa;
import Modelo.Erosketa;
import Modelo.Filma;
import Modelo.Saioa;

public class ErosketaV extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPaneErosketa;
    private int labelHeight = 14;
    private int labelMargin = 5;

    public ErosketaV(Sarrera[] sarrerak, Bezeroa bezeroaLog, Zinema[] zinemakList) {
    	ErosketaDAO erosketaDAO = new ErosketaDAO();
    	Erosketa ultimaErosketa = erosketaDAO.azkenErosketaLortu();
    	  int erosketaId = ultimaErosketa.getId_erosketak() + 1;
      	Erosketa erosketa = ultimaErosketa;
      	System.out.println(sarrerak[0]);
      	
      	int descontua= 0;
      	 if (sarrerak.length == 2) { 
      		 descontua = 20;
           } else if (sarrerak.length >= 3) { 
          	 descontua = 30;
           }
      	 erosketa.setId_erosketak(erosketaId);
      	boolean insertado = erosketaDAO.insertErosketa(erosketa);

      	if(insertado) {
      	    System.out.println("La nueva compra ha sido insertada correctamente en la base de datos.");
      	} else {
      	    System.out.println("Error al insertar la nueva compra en la base de datos.");
      	}
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 300);
        contentPaneErosketa = new JPanel();
        contentPaneErosketa.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneErosketa);
        contentPaneErosketa.setLayout(null);

        Bezeroa bezeroa = null;

        JLabel lblErabiltzailea = new JLabel("Erabiltzailea: " + bezeroaLog.getErabiltzailea());
        lblErabiltzailea.setBounds(10, 10, 200, 30);
        contentPaneErosketa.add(lblErabiltzailea);

        JLabel lblIzena = new JLabel("Izena: " + bezeroaLog.getIzena());
        lblIzena.setBounds(215, 10, 150, 30);
        contentPaneErosketa.add(lblIzena);

        JLabel lblNAN = new JLabel("NAN: " + bezeroaLog.getNan());
        lblNAN.setBounds(433, 10, 150, 30);
        contentPaneErosketa.add(lblNAN);

        JLabel lblGeneroa = new JLabel("Generoa: " + bezeroaLog.getSexua());
        lblGeneroa.setBounds(622, 10, 150, 30);
        contentPaneErosketa.add(lblGeneroa);

        JLabel lblZinema_izena = new JLabel("Zinema");
        lblZinema_izena.setBounds(10, 80, 150, 15);
        contentPaneErosketa.add(lblZinema_izena);

        for (int i = 0; i < sarrerak.length; i++) {
            Sarrera sarrera = sarrerak[i];
            Saioa saioa = sarrera.getSaioa();
            Areto aretoa = saioa.getAretoa();
            String zinema_id = aretoa.getZinema_id();
            String zinemaIzena = obtenerNombreCine(zinema_id, zinemakList);
            JLabel lblZinema = new JLabel(zinemaIzena);
            lblZinema.setBounds(10, 100 + i * (labelHeight + labelMargin), 150, labelHeight);
            contentPaneErosketa.add(lblZinema);

            JLabel lblAretoa = new JLabel(aretoa.getIzena());
            lblAretoa.setBounds(165, 100 + i * (labelHeight + labelMargin), 100, labelHeight);
            contentPaneErosketa.add(lblAretoa);

            JLabel lblFilma = new JLabel(saioa.getFilma().getIzena());
            lblFilma.setBounds(270, 100 + i * (labelHeight + labelMargin), 150, labelHeight);
            contentPaneErosketa.add(lblFilma);

            JLabel lblData = new JLabel(saioa.getDate().toString());
            lblData.setBounds(420, 100 + i * (labelHeight + labelMargin), 140, labelHeight);
            contentPaneErosketa.add(lblData);

            JLabel lblOrdua = new JLabel(saioa.getOrdua().toString());
            lblOrdua.setBounds(560, 100 + i * (labelHeight + labelMargin), 70, labelHeight);
            contentPaneErosketa.add(lblOrdua);

            JLabel lblPrezioa = new JLabel(String.valueOf(saioa.getFilma().getPrezioa()));
            lblPrezioa.setHorizontalAlignment(SwingConstants.CENTER);
            lblPrezioa.setBounds(630, 100 + i * (labelHeight + labelMargin), 60, labelHeight);
            contentPaneErosketa.add(lblPrezioa);

            JLabel lblKantitatea = new JLabel(String.valueOf(sarrera.getKantitatea()));
            lblKantitatea.setHorizontalAlignment(SwingConstants.CENTER);
            lblKantitatea.setBounds(702, 100 + i * (labelHeight + labelMargin), 70, labelHeight);
            contentPaneErosketa.add(lblKantitatea);
            
            double sarreraTotala = sarreraPrezioTotala(sarrera);
            JLabel lblsarreraTotala = new JLabel("" + sarreraTotala);
            lblsarreraTotala.setBounds(774, 100 + i * (labelHeight + labelMargin), 100, labelHeight);
            contentPaneErosketa.add(lblsarreraTotala);
        }

        JLabel lblAretoa_izena = new JLabel("Aretoa");
        lblAretoa_izena.setBounds(165, 80, 100, 15);
        contentPaneErosketa.add(lblAretoa_izena);

        JLabel lblFilma_izena = new JLabel("Filma");
        lblFilma_izena.setBounds(270, 80, 150, 15);
        contentPaneErosketa.add(lblFilma_izena);

        JLabel lblData_izena = new JLabel("Data");
        lblData_izena.setBounds(420, 80, 140, 15);
        contentPaneErosketa.add(lblData_izena);

        JLabel lblOrdua_izena = new JLabel("Ordua");
        lblOrdua_izena.setBounds(560, 80, 70, 15);
        contentPaneErosketa.add(lblOrdua_izena);

        JLabel lblPrezioa_izena = new JLabel("Prezioa");
        lblPrezioa_izena.setBounds(630, 80, 60, 15);
        contentPaneErosketa.add(lblPrezioa_izena);

        JLabel lblKantitatea_izena = new JLabel("Kantitatea");
        lblKantitatea_izena.setBounds(702, 79, 70, 15);
        contentPaneErosketa.add(lblKantitatea_izena);

        JLabel lblKantitatea_izena_1 = new JLabel("Diru totala");
        lblKantitatea_izena_1.setBounds(774, 80, 100, 15);
        contentPaneErosketa.add(lblKantitatea_izena_1);

        double diruTotala = erosketarenPrezioTotala(sarrerak);
        JLabel lblDiruTotala = new JLabel("" + diruTotala);
        lblDiruTotala.setBounds(774, 100 + sarrerak.length * (labelHeight + labelMargin), 100, labelHeight);
        contentPaneErosketa.add(lblDiruTotala);
        
        JButton btnFakturaSortu = new JButton("Faktura Sortu");
        btnFakturaSortu.setBounds(700, 120 + sarrerak.length * (labelHeight + labelMargin), 120, 30);
        contentPaneErosketa.add(btnFakturaSortu);

        btnFakturaSortu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
                String date = dateFormat.format(new Date());

                String nombreCarpeta = "C:\\Fakturas";
                File carpeta = new File(nombreCarpeta);

                
                if (!carpeta.exists()) {
                    if (carpeta.mkdirs()) {
                    } else {
                        System.err.println("Error al crear la carpeta 'Fakturas'.");
                    }
                }


                String rutaArchivo = nombreCarpeta + "\\faktura_" + date + ".txt";

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
                    writer.write("Erabiltzailea: " + bezeroaLog.getErabiltzailea() + "\n");
                    writer.write("Izena: " + bezeroaLog.getIzena() + "\n");
                    writer.write("NAN: " + bezeroaLog.getNan() + "\n");
                    writer.write("Generoa: " + bezeroaLog.getSexua() + "\n\n");

                    writer.write(String.format("%-30s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Zinema", "Aretoa", "Filma", "Data", "Ordua", "Prezioa", "Kantitatea", "Sarrera Totala"));
                    for (Sarrera sarrera : sarrerak) {
                        Saioa saioa = sarrera.getSaioa();
                        Areto aretoa = saioa.getAretoa();
                        String zinema_id = aretoa.getZinema_id();
                        String zinemaIzena = obtenerNombreCine(zinema_id, zinemakList);
                        double sarreraTotala = sarreraPrezioTotala(sarrera);
                        writer.write(String.format("%-30s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", zinemaIzena, aretoa.getIzena(), saioa.getFilma().getIzena(), saioa.getDate().toString(), saioa.getOrdua().toString(), saioa.getFilma().getPrezioa(), sarrera.getKantitatea(), sarreraTotala));
                    }

                    writer.write("\nDiru totala: " + diruTotala);
                    JOptionPane.showMessageDialog(null, "Faktura sortu da. Ruta: " + rutaArchivo);
                    dispose();
                    Kontroladorea kontroladorea = new Kontroladorea();
                    Kontroladorea.main(null);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
      
    

    private double erosketarenPrezioTotala(Sarrera[] sarrerak) {
        double totalPrice = 0;
        for (Sarrera sarrera : sarrerak) {
            totalPrice += sarreraPrezioTotala(sarrera);
        }
        if (sarrerak.length == 2) { 
            totalPrice *= 0.9;
        } else if (sarrerak.length >= 3) { 
            totalPrice *= 0.8;
        }
        return totalPrice;
    }

    private double sarreraPrezioTotala(Sarrera sarrera) {
        int kantitatea = sarrera.getKantitatea();
        double prezioSaioa = sarrera.getSaioa().getFilma().getPrezioa();
        double saioPrice = kantitatea * prezioSaioa;            
        return saioPrice;
    }

    public String obtenerNombreCine(String zinema_id, Zinema[] Zinemak) {
        for (Zinema zinemak : Zinemak) {
            if (zinemak.getId_zine().equals(zinema_id)) {
                return zinemak.getIzena();
            }
        }
        return null;
    }
}
