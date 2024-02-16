package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.JDatePicker;

public class Data extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JDatePicker datePicker;

    public Data() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // Crear el JDatePicker
        datePicker = new JDatePicker();
        datePicker.setBounds(10, 10, 200, 30); 
        contentPane.add(datePicker);
        contentPane.setLayout(null);
    }
}
