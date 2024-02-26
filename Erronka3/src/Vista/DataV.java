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
import Modelo.Erosketa;
import Modelo.Saioa;
import Modelo.Zinema;

public class DataV extends JFrame {
    private JPanel contentPaneSaioak;
    private JLabel lblData;
    private Date selectedDate; 
    private Bezeroa[] bezeroak;
    public DataV(Zinema zinemaAukera,Zinema[] zinemakList, Bezeroa bezeroaLog,Bezeroa[] bezeroak) {
    	this.bezeroak = bezeroak;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneSaioak = new JPanel();
        contentPaneSaioak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneSaioak);

        JButton btnAtzeraSaioak = new JButton("Atzera");
        btnAtzeraSaioak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ZinemakV zinemakFrame = new ZinemakV(zinemakList, bezeroaLog, bezeroak);
                zinemakFrame.setVisible(true);
                dispose(); 
            }
        });
        btnAtzeraSaioak.setBounds(10, 10, 71, 21);
        contentPaneSaioak.setLayout(null);
        contentPaneSaioak.add(btnAtzeraSaioak);

        lblData = new JLabel("");
        lblData.setBounds(41, 128, 286, 13);
        contentPaneSaioak.add(lblData);
        lblData.setVisible(false);


        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        properties.put("text.today", "Hoy");
        properties.put("text.month", "Mes");
        properties.put("text.year", "Año");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);


        Calendar today = Calendar.getInstance();
        model.setDate(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH));
        model.setSelected(true);
        datePanel.getModel().setSelected(true);


        model.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("value".equals(evt.getPropertyName())) {
                    selectedDate = (Date) evt.getNewValue(); 
                    if (selectedDate != null && selectedDate.before(today.getTime())) {
                        model.setDate(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH));
                        model.setSelected(true);
                    }
                }
            }
        });


        
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        datePicker.setBounds(150, 100, 150, 30);
        contentPaneSaioak.add(datePicker);


        JButton btnAukeratu = new JButton("Aukeratu");
        btnAukeratu.setBounds(310, 100, 100, 30);
        contentPaneSaioak.add(btnAukeratu);
        btnAukeratu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectedDate = 	model.getValue();
                if (selectedDate != null) {
                	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                	String data = dateFormat.format(selectedDate);
                    lblData.setText(data + " Ordutegia");
                    lblData.setVisible(true);

                    abrirSiguientePestana(selectedDate, zinemakList, bezeroaLog ,zinemaAukera);
                }
            }
        });
    }

    public void abrirSiguientePestana(Date selectedDate, Zinema[] zinemakList, Bezeroa bezeroaLog, Zinema zinemaAukera) {
        FilmakV filmak = new FilmakV(zinemaAukera, zinemakList, bezeroaLog, selectedDate, bezeroak);
        filmak.setVisible(true);
        dispose();
    }
    
 
}
