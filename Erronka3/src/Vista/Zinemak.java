package Vista;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.awt.event.ActionEvent;
import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import javax.swing.SpringLayout;

public class Zinemak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneZinemak;
	public String aukeratuZinema;

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
				aukeratuZinema = "Basauri zinema";
				FilmakAtala();				
			}
		});
		contentPaneZinemak.setLayout(null);
		btnBasauri.setForeground(new Color(0, 0, 0));
		btnBasauri.setBackground(new Color(153, 180, 209));
		btnBasauri.setBounds(10, 160, 147, 48);
		contentPaneZinemak.add(btnBasauri);
		
		JButton btnIdeal = new JButton("Ideal zinema");
		btnIdeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FilmakAtala();	
				aukeratuZinema = "Ideal zinema";
			}
		});
		btnIdeal.setBackground(SystemColor.activeCaption);
		btnIdeal.setBounds(243, 160, 183, 48);
		contentPaneZinemak.add(btnIdeal);
		
		JButton btnPortugalete = new JButton("Portugalete zinema");
		btnPortugalete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aukeratuZinema = "Portugalete zinema";
				FilmakAtala();	
			}
		});
		btnPortugalete.setBackground(SystemColor.activeCaption);
		btnPortugalete.setBounds(117, 218, 171, 35);
		contentPaneZinemak.add(btnPortugalete);
		
		JButton btnElorrieta = new JButton("Elorrieta Errekamari zinema");
		btnElorrieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aukeratuZinema = "Elorrieta-errekamari zinema";
				FilmakAtala();	
			}
		});
		btnElorrieta.setBackground(SystemColor.activeCaption);
		btnElorrieta.setBounds(243, 93, 183, 57);
		contentPaneZinemak.add(btnElorrieta);
		
		 JButton btnGazteiz = new JButton("Gazteiz Zinema");
	        btnGazteiz.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		FilmakAtala();	
	        		aukeratuZinema = "Gazteiz zinema";
	        	}
	        });
	        btnGazteiz.setBackground(SystemColor.activeCaption);
	        btnGazteiz.setBounds(16, 93, 142, 57);
	        contentPaneZinemak.add(btnGazteiz);
	        
		
		JButton btnAmaitu = new JButton("Amaitu");
		btnAmaitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				OngiEtorri ongiEtorri = new OngiEtorri();
				ongiEtorri.setVisible(true);
			}
		});
		btnAmaitu.setBounds(10, 10, 86, 21);
		contentPaneZinemak.add(btnAmaitu);
		
		Data();       
    
	}
	
public void Data() {
		
		UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        properties.put("text.today", "Hoy");
        properties.put("text.month", "Mes");
        properties.put("text.year", "Año");

        // Configurar el modelo para no permitir fechas pasadas
        model.setDate(2024, Calendar.FEBRUARY, 1);  // Configuramos la fecha mínima (1 de febrero de 2024)
        model.setSelected(true);

        // Crear el panel de fecha
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
        // Crear el picker de fecha con DateComponentFormatter
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        SpringLayout springLayout = (SpringLayout) datePicker.getLayout();
        springLayout.putConstraint(SpringLayout.NORTH, datePicker.getJFormattedTextField(), 0, SpringLayout.NORTH, datePicker);
        datePicker.setSize(202, 26);
        datePicker.setLocation(117, 45);

        // Configurar el picker de fecha
        datePicker.getJFormattedTextField().setEditable(true);

        // Añadir un PropertyChangeListener al modelo para validar las fechas
        model.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                Date selectedDate = model.getValue();
                Date currentDate = new Date();
                if (selectedDate != null && selectedDate.before(currentDate)) {
                    // Restablecer la fecha a la fecha mínima
                    model.setDate(2024, Calendar.FEBRUARY, 1);
                    model.setSelected(true);
                }
            }
        });
        
       
        contentPaneZinemak.add(datePicker);
	
	}

public void FilmakAtala () {
	
	Filmak filmak = new Filmak();
	filmak.setVisible(true);
	dispose();
}

}
