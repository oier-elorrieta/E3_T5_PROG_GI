package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import DAO.BezeroaDAO;
import DAO.ErosketaDAO;

import java.awt.*;
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

    public ErosketaV(Sarrera[] sarrerak, Bezeroa bezeroaLog,Zinema[] zinemakList) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneErosketa = new JPanel();
        contentPaneErosketa.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneErosketa);
        contentPaneErosketa.setLayout(null);

        Bezeroa bezeroa = null; // Inicializamos bezeroa como null para evitar NullPointerException

        if (bezeroaLog != null) {
            JLabel lblErabiltzailea = new JLabel("Erabiltzailea: " + bezeroaLog.getErabiltzailea());
            lblErabiltzailea.setBounds(10, 11, 200, 14);
            contentPaneErosketa.add(lblErabiltzailea);

            JLabel lblIzena = new JLabel("Izena: " + bezeroaLog.getIzena());
            lblIzena.setBounds(130, 11, 200, 14);
            contentPaneErosketa.add(lblIzena);

            JLabel lblNAN = new JLabel("NAN: " + bezeroaLog.getNan());
            lblNAN.setBounds(223, 11, 200, 14);
            contentPaneErosketa.add(lblNAN);

            JLabel lblGeneroa = new JLabel("Generoa: " + bezeroaLog.getSexua());
            lblGeneroa.setBounds(326, 11, 200, 14);
            contentPaneErosketa.add(lblGeneroa);

            bezeroa = bezeroaLog; // Asignamos bezeroaLog a bezeroa si no es null
        } else {
            System.out.println("El objeto Bezeroa es null");
        }

        String[] existingLabels = {"Zinemak", "Aretoa", "Filma", "Data", "Ordua", "Prezioa", "Kantitatea"};
        int labelX = 10;
        int labelY = 55;
        int labelWidth = 60;
        int labelHeight = 14;
        int labelMargin = 5;

        for (int i = 0; i < existingLabels.length; i++) {
            JLabel lbl = new JLabel(existingLabels[i]);
            lbl.setBounds(labelX + i * (labelWidth + labelMargin), labelY, labelWidth, labelHeight);
            contentPaneErosketa.add(lbl);
        }

        for (int i = 0; i < sarrerak.length; i++) {
            Sarrera sarrera = sarrerak[i];
            Saioa saioa = sarrera.getSaioa();
            Areto aretoa = saioa.getAretoa();
            Filma filma = saioa.getFilma();
            String zinema_id = aretoa.getZinema_id();
            String zinemaIzena = obtenerNombreCine(zinema_id,zinemakList);

            JLabel lblZinema = new JLabel(zinemaIzena);
            lblZinema.setBounds(labelX, labelY + (i + 1) * (labelHeight + labelMargin), labelWidth, labelHeight);
            contentPaneErosketa.add(lblZinema);

            JLabel lblAretoa = new JLabel(aretoa.getIzena());
            lblAretoa.setBounds(labelX + labelWidth + labelMargin, labelY + (i + 1) * (labelHeight + labelMargin), labelWidth, labelHeight);
            contentPaneErosketa.add(lblAretoa);

            JLabel lblFilma = new JLabel(filma.getIzena());
            lblFilma.setBounds(labelX + 2 * (labelWidth + labelMargin), labelY + (i + 1) * (labelHeight + labelMargin), labelWidth, labelHeight);
            contentPaneErosketa.add(lblFilma);

            JLabel lblData = new JLabel(saioa.getDate().toString());
            lblData.setBounds(labelX + 3 * (labelWidth + labelMargin), labelY + (i + 1) * (labelHeight + labelMargin), labelWidth, labelHeight);
            contentPaneErosketa.add(lblData);

            JLabel lblOrdua = new JLabel(saioa.getOrdua().toString());
            lblOrdua.setBounds(labelX + 4 * (labelWidth + labelMargin), labelY + (i + 1) * (labelHeight + labelMargin), labelWidth, labelHeight);
            contentPaneErosketa.add(lblOrdua);

            JLabel lblPrezioa = new JLabel(String.valueOf(filma.getPrezioa()));
            lblPrezioa.setBounds(labelX + 5 * (labelWidth + labelMargin), labelY + (i + 1) * (labelHeight + labelMargin), labelWidth, labelHeight);
            contentPaneErosketa.add(lblPrezioa);

            JLabel lblKantitatea = new JLabel(String.valueOf(sarrera.getKantitatea()));
            lblKantitatea.setBounds(labelX + 6 * (labelWidth + labelMargin), labelY + (i + 1) * (labelHeight + labelMargin), labelWidth, labelHeight);
            contentPaneErosketa.add(lblKantitatea);
        }
    }

    private Erosketa createNextErosketa(Sarrera[] sarrerak, Bezeroa bezeroaLog, Erosketa existingErosketak, int nextErosketaId) {
        double diruTotala = prezioaKalkulatu(sarrerak);
        return new Erosketa(sarrerak, diruTotala, bezeroaLog, nextErosketaId);
    }

    private double prezioaKalkulatu(Sarrera[] sarrerak) {
        double totalPrice = 0;
        for (Sarrera erositakoSarrerak : sarrerak) {
            int kant = erositakoSarrerak.getKantitatea();
            double prezioSaioa = erositakoSarrerak.getSaioa().getFilma().getPrezioa();
            double saioPrice;

            if (kant == 1) {
                saioPrice = kant * prezioSaioa;
            } else if (kant == 2) {
                saioPrice = kant * prezioSaioa * 0.8;
            } else {
                saioPrice = kant * prezioSaioa * 0.7;
            }
            totalPrice += saioPrice;
        }
        return totalPrice;
    }

    private int calculateNextId(Erosketa existingErosketak) {
        int maxId = existingErosketak.getId_erosketak();
        return maxId + 1;
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
