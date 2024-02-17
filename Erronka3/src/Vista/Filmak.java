package Vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import Modelo.Kontsultak;
import Modelo.Filma;

public class Filmak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public Kontsultak FilmaAukeratu[];
	public List<Filma> filmak;
	public String pelikula1;
	public String pelikula2;
	public String pelikula3;
	public String pelikula4;
	public String pelikula5;

	public Filmak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        
    
		contentPane.setBounds(654, 108, 487, 363);
		contentPane.setLayout(null);
		
		JButton btnAtzeraFilmak = new JButton("Atzera");
		btnAtzeraFilmak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Zinemak zinemak = new Zinemak();
				zinemak.setVisible(true);
				dispose();
			}
		});
		btnAtzeraFilmak.setBackground(SystemColor.activeCaption);
		btnAtzeraFilmak.setBounds(10, 10, 85, 21);
		contentPane.add(btnAtzeraFilmak);
		
		JToggleButton tglbtnPelikula1 = new JToggleButton(pelikula1);
		tglbtnPelikula1.setBounds(25, 50, 136, 47);
		contentPane.add(tglbtnPelikula1);
		
		JToggleButton tglbtnPelikula2 = new JToggleButton(pelikula2);
		tglbtnPelikula2.setBounds(35, 135, 126, 43);
		contentPane.add(tglbtnPelikula2);
		
		JToggleButton tglbtnPelikula3 = new JToggleButton(pelikula3);
		tglbtnPelikula3.setBounds(259, 50, 124, 47);
		contentPane.add(tglbtnPelikula3);
		
		JToggleButton tglbtnPelikula4 = new JToggleButton(pelikula4);
		tglbtnPelikula4.setBounds(259, 138, 142, 40);
		contentPane.add(tglbtnPelikula4);
		
		JToggleButton tglbtnpelikula5 = new JToggleButton(pelikula5);
		tglbtnpelikula5.setBounds(150, 202, 124, 40);
		contentPane.add(tglbtnpelikula5);
		
				System.out.println(FilmaAukeratu);
					
					
					
					
				
        
       
	}
}
