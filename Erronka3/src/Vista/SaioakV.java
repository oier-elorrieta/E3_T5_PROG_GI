package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import Modelo.Areto;
import Modelo.Bezeroa;
import Modelo.Filma;
import Modelo.Saioa;
import Modelo.Zinema;
import Modelo.Sarrera;
import java.awt.Font;
import java.util.Date;

public class SaioakV extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPaneSaioak;
    private JLabel lblOrdutegia;
    private JSpinner spinner;
    private static ArrayList<Sarrera> sarrerakList = new ArrayList<>();

    public SaioakV(String selectedMovie, Zinema[] zinemakList, Bezeroa bezeroaLog, Date selectedDate, Zinema selectedCinema) {
    	System.out.println(bezeroaLog);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneSaioak = new JPanel();
        contentPaneSaioak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneSaioak);
        contentPaneSaioak.setLayout(null);

        JButton btnAtzeraSaioak = new JButton("Atzera");
        btnAtzeraSaioak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FilmakV filmak = new FilmakV(selectedCinema, zinemakList, bezeroaLog, selectedDate);
                filmak.setVisible(true);
                dispose();
            }
        });
        btnAtzeraSaioak.setBounds(10, 10, 106, 29);
        contentPaneSaioak.add(btnAtzeraSaioak);

        lblOrdutegia = new JLabel("Ordutegia");
        lblOrdutegia.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblOrdutegia.setBounds(258, 114, 100, 30);
        contentPaneSaioak.add(lblOrdutegia);

        Filma filmaAukera = filmakZerrenda(selectedMovie, zinemakList);

        JLabel lblfilmaIzena = new JLabel(filmaAukera.getIzena());
        lblfilmaIzena.setHorizontalAlignment(SwingConstants.CENTER);
        lblfilmaIzena.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblfilmaIzena.setBounds(78, 50, 325, 39);
        contentPaneSaioak.add(lblfilmaIzena);

        int iraupena = filmaAukera.getIraupena();
        String filmaIraupena = iraupena + " minutu";

        JLabel lblIraupena = new JLabel(filmaIraupena + " irauten du");
        lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblIraupena.setBounds(10, 87, 211, 30);
        contentPaneSaioak.add(lblIraupena);

        JLabel lblGeneroa = new JLabel("Generoa: " + filmaAukera.getGeneroa());
        lblGeneroa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGeneroa.setBounds(10, 131, 144, 21);
        contentPaneSaioak.add(lblGeneroa);

        JLabel lblPrezioa = new JLabel("Prezioa " + filmaAukera.getPrezioa() + " €");
        lblPrezioa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPrezioa.setBounds(10, 163, 144, 21);
        contentPaneSaioak.add(lblPrezioa);
        
        JLabel lblAreato = new JLabel("Aretoa:");
        lblAreato.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblAreato.setBounds(10, 195, 290, 21);
        contentPaneSaioak.add(lblAreato);

        JComboBox<String> saioakComboBox = new JComboBox<>();
        saioakComboBox.setBounds(176, 156, 248, 46);
        contentPaneSaioak.add(saioakComboBox);


        saioakComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedSaioaInfo = (String) saioakComboBox.getSelectedItem();
                if (selectedSaioaInfo != null) {
                    Saioa selectedSaioa = obtenerSaioa(selectedSaioaInfo, selectedMovie, zinemakList);
                    if (selectedSaioa != null) {
                        String areto = selectedSaioa.getAretoa().getIzena();
                        lblAreato.setText("Areto: " + areto);
                    }
                }
            }
        });

        JButton btnErosi = new JButton("Amaitu erosketa");
        btnErosi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedSaioaInfo = (String) saioakComboBox.getSelectedItem();
                if (selectedSaioaInfo != null) {
                    Saioa selectedSaioa = obtenerSaioa(selectedSaioaInfo, selectedMovie, zinemakList);
                    if (selectedSaioa != null) {
                        int kantitatea = (int) spinner.getValue();
                        Sarrera sarrera = new Sarrera(kantitatea, selectedSaioa);

                        sarrerakList.add(sarrera);
                        lblAreato.setText("Areato: " + selectedSaioa.getAretoa());
                        ErosketaV erosketaV = new ErosketaV(sarrerakList.toArray(new Sarrera[0]), bezeroaLog, zinemakList);
                        erosketaV.setVisible(true);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ez da saiorik aukeratu");
                }
            }
        });
        btnErosi.setBounds(298, 10, 126, 29);
        contentPaneSaioak.add(btnErosi);

        JButton btnAukeratu = new JButton("Jarraitu erosten");
        btnAukeratu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedSaioaInfo = (String) saioakComboBox.getSelectedItem();
                if (selectedSaioaInfo != null) {
                    Saioa selectedSaioa = obtenerSaioa(selectedSaioaInfo, selectedMovie, zinemakList);
                    int kantitatea = (int) spinner.getValue();
                    Sarrera sarrera = new Sarrera(kantitatea, selectedSaioa);
                    sarrerakList.add(sarrera);
                    System.out.println("Lista de Sarreras:");
                    for (Sarrera s : sarrerakList) {
                        System.out.println(s);
                    }

                    ZinemakV ZinemakV = new ZinemakV(zinemakList, bezeroaLog);
                    ZinemakV.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Ez da saiorik aukeratu");
                }
            }
        });
        btnAukeratu.setBounds(214, 222, 175, 29);
        contentPaneSaioak.add(btnAukeratu);

        SpinnerModel spinnerModel = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spinner = new JSpinner(spinnerModel);
        spinner.setBounds(105, 226, 49, 20);
        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println("Nuevo valor: " + spinner.getValue());
            }
        });
        contentPaneSaioak.add(spinner);

        JLabel lblKant = new JLabel("Kantitatea");
        lblKant.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblKant.setBounds(10, 226, 112, 20);
        contentPaneSaioak.add(lblKant);

        Set<String> saioakSet = new HashSet<>();

        LocalDate selectedLocalDate = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        for (Zinema zinema : zinemakList) {
            for (Saioa saioa : zinema.getSaioalist()) {
                if (saioa.getFilma().getIzena().equals(selectedMovie)) {
                    LocalDate saioaLocalDate = saioa.getDate();

                    if (!saioaLocalDate.isBefore(selectedLocalDate)) {
                        String saioaInfo = "Data: " + saioa.getDate() + " - Ordua: " + saioa.getOrdua();

                        if (saioakSet.add(saioaInfo)) {
                            saioakComboBox.addItem(saioaInfo);
                        }
                    }
                }
            }
        }
    }

    public Saioa obtenerSaioa(String selectedSaioaInfo, String selectedMovie, Zinema[] zinemakList) {
        String[] parts = selectedSaioaInfo.split(" - ");
        String dateString = parts[0].replace("Data: ", "");
        String timeString = parts[1].replace("Ordua: ", "");
        LocalDate saioaDate = LocalDate.parse(dateString);
        String[] timeParts = timeString.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);

        for (Zinema zinema : zinemakList) {
            for (Saioa saioa : zinema.getSaioalist()) {
                if (saioa.getFilma().getIzena().equals(selectedMovie) &&
                        saioa.getDate().equals(saioaDate) &&
                        saioa.getOrdua().getHour() == hour &&
                        saioa.getOrdua().getMinute() == minute) {
                    return saioa;
                }
            }
        }
        return null;
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
