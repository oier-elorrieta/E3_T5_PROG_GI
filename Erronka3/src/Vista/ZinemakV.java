package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Modelo.Areto;
import Modelo.Bezeroa;
import Modelo.Zinema;
import Modelo.SarreraFuntzioa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZinemakV extends JFrame {

    private static final long serialVersionUID = 1557861239751784319L;
    private JPanel contentPaneZinemak;
    private Zinema[] zinemakList;
    private Bezeroa bezeroaLog;
    private Bezeroa[] bezeroak;

    public ZinemakV(Zinema[] zinemakList, Bezeroa bezeroaLog, Bezeroa[] bezeroak) {
        this.zinemakList = zinemakList;
        this.bezeroaLog = bezeroaLog;
        this.bezeroak = bezeroak;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneZinemak = new JPanel();
        contentPaneZinemak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneZinemak);
        contentPaneZinemak.setLayout(new GridLayout(0, 1, 0, 10));

        for (Zinema zinema : zinemakList) {
            JButton btnCinema = new JButton(zinema.getIzena());
            btnCinema.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String zinemaAukeraID = zinema.getId_zine();
                    zinemaAukeratu(zinemaAukeraID);
                }
            });
            contentPaneZinemak.add(btnCinema);
        }

        JButton btnAmaitu = new JButton("Amaitu");
        btnAmaitu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SarreraFuntzioa.getInstance().reiniciarSarrerakList();
                dispose();
                LoginaV login = new LoginaV(zinemakList, bezeroak);
                login.setVisible(true);
            }
        });
        contentPaneZinemak.add(btnAmaitu);
    }

    public void zinemaAukeratu(String zinemaAukeraID) {
        Zinema zinemaAukera = null;
        for (Zinema zinema : zinemakList) {
            if (zinema.getId_zine().equals(zinemaAukeraID)) {
                zinemaAukera = zinema;
                break;
            }
        }
        DataV dataFrame = new DataV(zinemaAukera, zinemakList, bezeroaLog, bezeroak);
        dataFrame.setVisible(true);
        dispose();
    }
}
