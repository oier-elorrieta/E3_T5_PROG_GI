package Vista;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Saioak extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPaneSaioak;
 
    public Saioak(String selectedZinema) { 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneSaioak = new JPanel();
        contentPaneSaioak.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPaneSaioak);
        
        JButton btnAtzeraSaioak = new JButton("Atzera");
        btnAtzeraSaioak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Filmak filmak = new Filmak(selectedZinema); 
                filmak.setVisible(true);
                dispose();
            }
        });
        btnAtzeraSaioak.setBackground(SystemColor.activeCaption);
        btnAtzeraSaioak.setBounds(10, 10, 85, 21);
        contentPaneSaioak.add(btnAtzeraSaioak);
    }
}
