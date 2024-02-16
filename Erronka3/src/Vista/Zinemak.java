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
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.jdatepicker.JDatePicker;

public class Zinemak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneZinemak;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zinemak frame = new Zinemak();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		btnBasauri.setBounds(39, 80, 129, 28);
		contentPaneZinemak.add(btnBasauri);
		
		JButton btnIdeal = new JButton("Ideal zinema");
		btnIdeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIdeal.setBackground(SystemColor.activeCaption);
		btnIdeal.setBounds(272, 43, 129, 26);
		contentPaneZinemak.add(btnIdeal);
		
		JButton btnPortugalete = new JButton("Portugalete zinema");
		btnPortugalete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPortugalete.setBackground(SystemColor.activeCaption);
		btnPortugalete.setBounds(39, 41, 129, 28);
		contentPaneZinemak.add(btnPortugalete);
		
		JButton btnGazteiz = new JButton("Gazteiz Zinema");
		btnGazteiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGazteiz.setBackground(SystemColor.activeCaption);
		btnGazteiz.setBounds(272, 81, 129, 26);
		contentPaneZinemak.add(btnGazteiz);
		
		JButton btnElorrieta = new JButton("Elorrieta Errekamari zinema");
		btnElorrieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnElorrieta.setBackground(SystemColor.activeCaption);
		btnElorrieta.setBounds(129, 119, 179, 28);
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
		
       
    
	}
}
