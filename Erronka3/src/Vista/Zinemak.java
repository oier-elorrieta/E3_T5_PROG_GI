package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JEditorPane;
import java.awt.Panel;
import javax.swing.UIManager;
public class Zinemak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneZinemak;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Zinemak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneZinemak = new JPanel();
		contentPaneZinemak.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneZinemak);
		contentPaneZinemak.setLayout(null);
		
		
		
		JButton btnBasauri = new JButton("Basauri zinema");
		btnBasauri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnBasauri.setForeground(new Color(0, 0, 0));
		btnBasauri.setBackground(new Color(153, 180, 209));
		btnBasauri.setBounds(39, 60, 129, 28);
		contentPaneZinemak.add(btnBasauri);
		
		JButton btnIdeal = new JButton("Ideal zinema");
		btnIdeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIdeal.setBackground(SystemColor.activeCaption);
		btnIdeal.setBounds(272, 12, 129, 26);
		contentPaneZinemak.add(btnIdeal);
		
		JButton btnPortugalete = new JButton("Portugalete zinema");
		btnPortugalete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPortugalete.setBackground(SystemColor.activeCaption);
		btnPortugalete.setBounds(39, 11, 129, 28);
		contentPaneZinemak.add(btnPortugalete);
		
		JButton btnGazteiz = new JButton("Gazteiz Zinema");
		btnGazteiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGazteiz.setBackground(SystemColor.activeCaption);
		btnGazteiz.setBounds(272, 61, 129, 26);
		contentPaneZinemak.add(btnGazteiz);
		
		JButton btnElorrieta = new JButton("Elorrieta Errekamari zinema");
		btnElorrieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnElorrieta.setBackground(SystemColor.activeCaption);
		btnElorrieta.setBounds(129, 99, 179, 28);
		contentPaneZinemak.add(btnElorrieta);
		
		JButton btnAmaitu = new JButton("Amaitu");
		btnAmaitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				OngiEtorri ongiEtorri = new OngiEtorri();
				ongiEtorri.setVisible(true);
			}
		});
		btnAmaitu.setBounds(341, 232, 85, 21);
		contentPaneZinemak.add(btnAmaitu);
		
		
		JButton btnBasauri_1 = new JButton("Basauri zinema");
		btnBasauri_1.setForeground(Color.BLACK);
		btnBasauri_1.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		btnBasauri_1.setBounds(39, 60, 129, 28);
		contentPaneZinemak.add(btnBasauri_1);
		
		JButton btnIdeal_1 = new JButton("Ideal zinema");
		btnIdeal_1.setBackground(SystemColor.activeCaption);
		btnIdeal_1.setBounds(272, 12, 129, 26);
		contentPaneZinemak.add(btnIdeal_1);
		
		JButton btnPortugalete_1 = new JButton("Portugalete zinema");
		btnPortugalete_1.setBackground(SystemColor.activeCaption);
		btnPortugalete_1.setBounds(39, 11, 129, 28);
		contentPaneZinemak.add(btnPortugalete_1);
		
		JButton btnGazteiz_1 = new JButton("Gazteiz Zinema");
		btnGazteiz_1.setBackground(SystemColor.activeCaption);
		btnGazteiz_1.setBounds(272, 61, 129, 26);
		contentPaneZinemak.add(btnGazteiz_1);
		
		JButton btnElorrieta_1 = new JButton("Elorrieta Errekamari zinema");
		btnElorrieta_1.setBackground(SystemColor.activeCaption);
		btnElorrieta_1.setBounds(129, 99, 179, 28);
		contentPaneZinemak.add(btnElorrieta_1);
		
		JButton btnAmaitu_1 = new JButton("Amaitu");
		btnAmaitu_1.setBounds(341, 232, 85, 21);
		contentPaneZinemak.add(btnAmaitu_1);
		
		JDayChooser dayChooser = new JDayChooser();
        dayChooser.setBounds(139, 138, 168, 133);
        contentPaneZinemak.add(dayChooser);
        
		 JButton boton = new JButton("Data");
	        boton.addActionListener(e -> {
	            System.out.println("Fecha seleccionada: " + dayChooser.getDay());
	        });

	        contentPaneZinemak.add(boton);
	        
	        
       
    
	}
}
