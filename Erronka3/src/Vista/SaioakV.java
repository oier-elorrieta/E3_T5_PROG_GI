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

    public SaioakV(String selectedMovie, Zinema[] zinemakList, Bezeroa[] bezeroak, Date selectedDate, Zinema selectedCinema) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneSaioak = new JPanel();
        contentPaneSaioak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneSaioak);
        contentPaneSaioak.setLayout(null);

        JButton btnAtzeraSaioak = new JButton("Atzera");
        btnAtzeraSaioak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FilmakV filmak = new FilmakV(selectedCinema, zinemakList, bezeroak, selectedDate);
                filmak.setVisible(true);
                dispose();
            }
        });
        btnAtzeraSaioak.setBounds(10, 10, 79, 29);
        contentPaneSaioak.add(btnAtzeraSaioak);

        lblOrdutegia = new JLabel("Ordutegia");
        lblOrdutegia.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblOrdutegia.setBounds(160, 20, 100, 30);
        contentPaneSaioak.add(lblOrdutegia);

        Filma filmaAukera = filmakZerrenda(selectedMovie, zinemakList);

        JLabel lblfilmaIzena = new JLabel(filmaAukera.getIzena());
        lblfilmaIzena.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblfilmaIzena.setBounds(10, 50, 350, 39);
        contentPaneSaioak.add(lblfilmaIzena);

        int iraupena = filmaAukera.getIraupena();
        String filmaIraupena = iraupena + " minutu";

        JLabel lblIraupena = new JLabel(filmaIraupena + " irauten du");
        lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblIraupena.setBounds(10, 90, 211, 30);
        contentPaneSaioak.add(lblIraupena);

        JLabel lblGeneroa = new JLabel("Generoa: " + filmaAukera.getGeneroa());
        lblGeneroa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGeneroa.setBounds(10, 128, 144, 21);
        contentPaneSaioak.add(lblGeneroa);

        JLabel lblPrezioa = new JLabel("Prezioa " + filmaAukera.getPrezioa() + " €");
        lblPrezioa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPrezioa.setBounds(10, 160, 144, 21);
        contentPaneSaioak.add(lblPrezioa);

        JComboBox<String> saioakComboBox = new JComboBox<>();
        saioakComboBox.setBounds(160, 143, 264, 59);
        contentPaneSaioak.add(saioakComboBox);

        JButton btnErosi = new JButton("Erosi");
        btnErosi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedSaioaInfo = (String) saioakComboBox.getSelectedItem();
                if (selectedSaioaInfo != null) {
                    Saioa selectedSaioa = obtenerSaioa(selectedSaioaInfo, selectedMovie, zinemakList);
                    int kantitatea = (int) spinner.getValue();
                    Sarrera sarrera = new Sarrera(kantitatea, selectedSaioa);

                    sarrerakList.add(sarrera);

                    ErosketaV erosketaV = new ErosketaV(sarrerakList.toArray(new Sarrera[0]), bezeroak);
                    erosketaV.setVisible(true);
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Ez da saiorik aukeratu");
                }
            }
        });
        btnErosi.setBounds(345, 13, 79, 29);
        contentPaneSaioak.add(btnErosi);

        JButton btnAukeratu = new JButton("Jarraitu aukeratzen");
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

                    ZinemakV ZinemakV = new ZinemakV(zinemakList, bezeroak);
                    ZinemakV.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Ez da saiorik aukeratu");
                }
            }
        });
        btnAukeratu.setBounds(249, 227, 175, 23);
        contentPaneSaioak.add(btnAukeratu);

        SpinnerModel spinnerModel = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spinner = new JSpinner(spinnerModel);
        spinner.setBounds(20, 228, 49, 20);
        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println("Nuevo valor: " + spinner.getValue());
            }
        });
        contentPaneSaioak.add(spinner);

        JLabel lblKant = new JLabel("Kantitatea");
        lblKant.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblKant.setBounds(10, 203, 112, 14);
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
