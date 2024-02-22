package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import org.jdatepicker.impl.*;

import Modelo.Bezeroa;
import Modelo.Filma;
import Modelo.Saioa;
import Modelo.Zinema;
import java.awt.Font;

public class Saioak extends JFrame {
    private Zinema zinemaAukera; 
    private JPanel contentPaneSaioak;
    private JLabel lblData;
    private Date selectedDate;
    
    
    public Saioak(String selectedMovie, Zinema[] zinemakList, Bezeroa[] bezeroak,Date selectedDate) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneSaioak = new JPanel();
        contentPaneSaioak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneSaioak);

        JButton btnAtzeraSaioak = new JButton("Atzera");
        btnAtzeraSaioak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Filmak filmak = new Filmak(zinemaAukera,zinemakList,bezeroak,selectedDate);
                filmak.setVisible(true);
                dispose();
            }
        });
        btnAtzeraSaioak.setBounds(10, 10, 71, 21);
        contentPaneSaioak.setLayout(null);
        contentPaneSaioak.add(btnAtzeraSaioak);

        lblData = new JLabel("Ordutegia");
        lblData.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblData.setBounds(10, 172, 286, 21);
        contentPaneSaioak.add(lblData);
        
        

        // Crear el panel de fecha
        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        properties.put("text.today", "Hoy");
        properties.put("text.month", "Mes");
        properties.put("text.year", "Año");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);

        // Establecer la fecha mínima como hoy
        Calendar today = Calendar.getInstance();
        model.setDate(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH));
        model.setSelected(true);
        datePanel.getModel().setSelected(true);

        // Agregar un PropertyChangeListener al modelo para validar las fechas
        model.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("value".equals(evt.getPropertyName())) {
                    Date selectedDate = (Date) evt.getNewValue();
                    if (selectedDate != null && selectedDate.before(today.getTime())) {
                        model.setDate(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH));
                        model.setSelected(true);
                    }
                }
            }
        });

        // Crear el picker de fecha con DateComponentFormatter
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        datePicker.getJFormattedTextField().setBounds(0, 0, 122, 21);
        datePicker.setBounds(132, 20, 150, 30);
        contentPaneSaioak.add(datePicker);
        datePicker.setLayout(null);
  
       Filma filmaAukera = filmakZerrenda(selectedMovie,zinemakList);

        
        JLabel lblfilmaIzena = new JLabel(filmaAukera.getIzena());
        lblfilmaIzena.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblfilmaIzena.setBounds(108, 67, 234, 39);
        contentPaneSaioak.add(lblfilmaIzena);
        
        int iraupena = filmaAukera.getIraupena();        
        String filmaIraupena = "";
        
        filmaIraupena = iraupena + filmaIraupena;
        
        JLabel lblIraupena = new JLabel(filmaIraupena +" minutu irauten du");
        lblIraupena.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblIraupena.setBounds(10, 92, 174, 30);
        contentPaneSaioak.add(lblIraupena);
        
        JLabel lblGeneroa = new JLabel("Generoa: " +filmaAukera.getGeneroa());
        lblGeneroa.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblGeneroa.setBounds(10, 132, 144, 21);
        contentPaneSaioak.add(lblGeneroa);
    }

    private String formatearFecha(Date fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(fecha);
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
