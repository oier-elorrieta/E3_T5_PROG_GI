package Vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.SaioaDAO;
import DAO.ZinemakDAO;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import Modelo.Kontsultak;
import Modelo.Saioa;
import Modelo.Zinema;
import Modelo.Filma;
import javax.swing.JScrollPane;

public class Filmak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneFilmak;
	public List<Filma> filmak;

	public Filmak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneFilmak = new JPanel();
		contentPaneFilmak.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneFilmak);
        
    
		contentPaneFilmak.setBounds(654, 108, 487, 363);
		contentPaneFilmak.setLayout(null);
		
		 SaioaDAO saioaDAO = new SaioaDAO();
		 Saioa[] saioaList = saioaDAO.getAllSaioak();


	        if (saioaList != null) {
	            for ( : zinemakList) {
	                if (Saioa != null) { // Check if zinema is not null
	                    JButton btnCinema = new JButton(Filma.getIzena());
	                    btnCinema.addActionListener(new ActionListener() {
	                        public void actionPerformed(ActionEvent e) {
	                            String aukeratuPelikula = Filma.getIzena();
	                           
	                        }
	                    });
	                    contentPaneFilmak.add(btnCinema);
	                }
	            }
	        }
			Saioak saioak = new Saioak();
			saioak.setVisible(true);
			dispose();
	        
		
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
		contentPaneFilmak.add(btnAtzeraFilmak);
	
					
					
					
					
				
        
       
	}
}
