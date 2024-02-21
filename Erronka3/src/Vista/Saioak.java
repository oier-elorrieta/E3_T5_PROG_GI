package Vista;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Modelo.Areto;
import Modelo.Filma;
import Modelo.Kontsultak;
import Modelo.Saioa;
import Modelo.Zinema;
import javax.swing.JLabel;

public class Saioak extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPaneSaioak;
    public  Zinema zinemaAukera;
    private JLabel lblData;
 
    public Saioak(String closestMovies,Zinema[] zinemakList) { 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneSaioak = new JPanel();
        contentPaneSaioak.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPaneSaioak);
        
        JButton btnAtzeraSaioak = new JButton("Atzera");
        btnAtzeraSaioak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
				Filmak filmak = new Filmak(zinemaAukera, zinemakList ); 
                filmak.setVisible(true);
                dispose();
            }
        });
        contentPaneSaioak.setLayout(null);
        btnAtzeraSaioak.setBackground(SystemColor.activeCaption);
        btnAtzeraSaioak.setBounds(10, 10, 71, 21);
        contentPaneSaioak.add(btnAtzeraSaioak);
        
       
        
        JButton btnDataAukeratu = new JButton("Aukeratu");
        btnDataAukeratu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				lblData.setVisible(true);
				System.out.println(Data());
				
        	}
        });
        btnDataAukeratu.setBounds(317, 73, 85, 21);
        contentPaneSaioak.add(btnDataAukeratu);
        Date data = Data();
       String dataLabel = "";
        
           SimpleDateFormat dataFormatua = new SimpleDateFormat("dd/MM/YYYY");
            dataLabel = dataFormatua.format(data);
        
        
        lblData = new JLabel(dataLabel + " Ordutegia (" + closestMovies + ")");
        lblData.setBounds(41, 128, 286, 13);
        contentPaneSaioak.add(lblData);
        lblData.setVisible(false);
         
        
        
        
    }
    
    public Date Data() {

        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        properties.put("text.today", "Hoy");
        properties.put("text.month", "Mes");
        properties.put("text.year", "Año");

        // Configurar el modelo para no permitir fechas pasadas
        model.setDate(2024, Calendar.FEBRUARY, 1);  // Configuramos la fecha mínima (1 de febrero de 2024)
        model.setSelected(true);
        SpringLayout springLayout = new SpringLayout();
        // Crear el panel de fecha
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
        // Crear el picker de fecha con DateComponentFormatter
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        springLayout.putConstraint(SpringLayout.NORTH, datePicker.getJFormattedTextField(), 0, SpringLayout.NORTH, datePicker);
        springLayout = (SpringLayout) datePicker.getLayout();
        datePicker.setSize(202, 31);
        datePicker.setLocation(109, 73);

        // Configurar el picker de fecha
        datePicker.getJFormattedTextField().setEditable(true);

        // Añadir un PropertyChangeListener al modelo para validar las fechas
        model.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                Date selectedDate = model.getValue();
                Date currentDate = new Date();
                
                if (selectedDate != null && selectedDate.before(currentDate)) {
                     //Restablecer la fecha a la fecha mínima
                   model.setDate(2024, Calendar.FEBRUARY, 1);
                    model.setSelected(true);
                }
                
            }
        });

        contentPaneSaioak.add(datePicker);
        
        

        return model.getValue(); // Devolver la fecha seleccionada
    }
    
}
