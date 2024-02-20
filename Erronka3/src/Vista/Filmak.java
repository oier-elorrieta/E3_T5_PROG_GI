package Vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.FilmaDAO;
import DAO.KonexioaBD;
import DAO.SaioaDAO;
import DAO.ZinemakDAO;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
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
	private Kontsultak kontsulta;


	public Filmak() {
        kontsulta = new Kontsultak(new KonexioaBD());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPaneFilmak = new JPanel();
		contentPaneFilmak.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneFilmak);
		contentPaneFilmak.setLayout(null);

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

		 
	         

		String[] filmakZinema = kontsulta.FilmakZinema();
		
			for (int i = 0; i > filmakZinema.length; i++ ) {
				
				JButton btnCinema = new JButton(filmakZinema[i]);
                btnCinema.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    	 Saioak saioak = new Saioak();
                		saioak.setVisible(true);
                		dispose();
                        
                    }
                });
                contentPaneFilmak.add(btnCinema);
            }

			}
	}


//SaioaDAO saioaDAO = new SaioaDAO();
//Saioa[] saioaList = saioaDAO.getAllSaioak();
//
//ZinemakDAO zinemakDAO = new ZinemakDAO();
//   Zinema[] zinemakList = zinemakDAO.getAllZinemak();
//   
//   FilmaDAO filmaDAO = new FilmaDAO();
//   List<Filma> filma = filmaDAO.getAllFilmak();
//
//
//   if (zinemakList != null) {
//       for ( Zinema saioalist: zinemakList ) {
//           if ( aukeratuZinema != null) { // Check if zinema is not null
//           	List<Filma> filmakZinemaren = (List<Filma>)filma; // Asume que hay un método getFilmak en Zinemak
//
//               if (filmakZinemaren != null) {
//                   for (Filma aukeratuFilma : filmakZinemaren) {
//                       JButton btnPelikula = new JButton(aukeratuFilma.getIzena());
//                       btnPelikula.addActionListener(new ActionListener() {
//                           public void actionPerformed(ActionEvent e) {
//                               // Realizar acciones al hacer clic en una película
//                               String aukeratuPelikula = aukeratuFilma.getIzena();
//                           }
//                       });
//                       contentPaneFilmak.add(btnPelikula);
//                   }
//               }
//           }
//       }
//      
//   }
//                       
	              
