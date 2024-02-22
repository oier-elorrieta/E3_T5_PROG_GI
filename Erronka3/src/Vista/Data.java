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
import Modelo.Zinema;

public class Data extends JFrame {
    private JPanel contentPaneSaioak;
    private JLabel lblData;
    private Date selectedDate; 

    public Data(Zinema zinemaAukera,Zinema[] zinemakList, Bezeroa[] bezeroak) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneSaioak = new JPanel();
        contentPaneSaioak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneSaioak);

        JButton btnAtzeraSaioak = new JButton("Atzera");
        btnAtzeraSaioak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Zinemak zinemakFrame = new Zinemak(zinemakList, bezeroak);
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
                    selectedDate = (Date) evt.getNewValue(); // Actualizar la fecha seleccionada
                    if (selectedDate != null && selectedDate.before(today.getTime())) {
                        model.setDate(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH));
                        model.setSelected(true);
                    }
                }
            }
        });

        // Crear el picker de fecha con DateComponentFormatter
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        datePicker.setBounds(150, 100, 150, 30);
        contentPaneSaioak.add(datePicker);

        // Botón Aukeratu
        JButton btnAukeratu = new JButton("Aukeratu");
        btnAukeratu.setBounds(310, 100, 100, 30);
        contentPaneSaioak.add(btnAukeratu);
        btnAukeratu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.out.println(zinemaAukera.getId_zine());
            	System.out.println(zinemakList[0]);
                selectedDate = 	model.getValue();
                if (selectedDate != null) {
                    lblData.setText(formatearFecha(selectedDate) + " Ordutegia");
                    lblData.setVisible(true);
                    // Abrir la siguiente pestaña y pasar la fecha seleccionada
                    abrirSiguientePestana(selectedDate, zinemakList, bezeroak,zinemaAukera);
                }
            }
        });
    }

    public void abrirSiguientePestana(Date selectedDate, Zinema[] zinemakList, Bezeroa[] bezeroak, Zinema zinemaAukera) {
        Filmak filmak = new Filmak(zinemaAukera, zinemakList, bezeroak, selectedDate);
        filmak.setVisible(true);
        dispose(); // Cierra la ventana actual (Data)
    }
    
    private String formatearFecha(Date fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(fecha);
    }
}
