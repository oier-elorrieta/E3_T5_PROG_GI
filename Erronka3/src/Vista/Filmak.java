package Vista;

import java.awt.Font;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.DirectoryStream.Filter;

public class Filmak{
    public Filmak() {
    	JPanel panel = new JPanel();
        JButton btnIrudia = new JButton("");
        btnIrudia.setBounds(60, 0, 402, 517);
        btnIrudia.setIcon(new ImageIcon(Filmak.class.getResource("Irudiak/Pelis/9.jpg")));
        btnIrudia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel.setLayout(null);
        panel.add(btnIrudia);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(654, 108, 487, 363);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblTtituloa = new JLabel();
        lblTtituloa.setFont(new Font("Tahoma", Font.PLAIN, 23));
        lblTtituloa.setBounds(32, 11, 95, 77);
        lblTtituloa.setText("Tituloa");
        panel_1.add(lblTtituloa);
        
        JLabel lblIraupena = new JLabel("Iraupena");
        lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 23));
        lblIraupena.setBounds(32, 136, 95, 57);
        panel_1.add(lblIraupena);
        
        JLabel lblGeneroa = new JLabel("Generoa");
        lblGeneroa.setFont(new Font("Tahoma", Font.PLAIN, 23));
        lblGeneroa.setBounds(32, 250, 95, 57);
        panel_1.add(lblGeneroa);
        
        JLabel lblTituloaejemplo = new JLabel();
        lblTituloaejemplo.setText("TituloaEjemplo");
        lblTituloaejemplo.setFont(new Font("Tahoma", Font.PLAIN, 23));
        lblTituloaejemplo.setBounds(158, 11, 319, 77);
        panel_1.add(lblTituloaejemplo);
        
        JLabel lblIraupenaejemplo = new JLabel("IraupenaEjemplo");
        lblIraupenaejemplo.setFont(new Font("Tahoma", Font.PLAIN, 23));
        lblIraupenaejemplo.setBounds(158, 136, 319, 57);
        panel_1.add(lblIraupenaejemplo);
        
        JLabel lblGeneroaejemplo = new JLabel("GeneroaEjemplo");
        lblGeneroaejemplo.setFont(new Font("Tahoma", Font.PLAIN, 23));
        lblGeneroaejemplo.setBounds(158, 250, 319, 57);
        panel_1.add(lblGeneroaejemplo);
    }
}
