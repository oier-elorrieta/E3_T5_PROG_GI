package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import Modelo.Sarrera;
import Modelo.Bezeroa;

public class ErosketaV extends JFrame {
    private JPanel contentPaneErosketa;
    private JTextArea textAreaSarrerak;

    public ErosketaV(Sarrera[] sarrerak, Bezeroa[] bezeroak) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneErosketa = new JPanel();
        contentPaneErosketa.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneErosketa);
        contentPaneErosketa.setLayout(new BorderLayout(0, 0));

        JScrollPane scrollPane = new JScrollPane();
        contentPaneErosketa.add(scrollPane, BorderLayout.CENTER);

        textAreaSarrerak = new JTextArea();
        textAreaSarrerak.setEditable(false);
        scrollPane.setViewportView(textAreaSarrerak);

        // Verifica si sarrerak no es nulo y muestra su contenido en el JTextArea
        if (sarrerak != null) {
            textAreaSarrerak.append("Contenido de sarrerak:\n");
            for (Sarrera s : sarrerak) {
                textAreaSarrerak.append(s.toString() + "\n");
            }
        } else {
            textAreaSarrerak.append("El array sarrerak está vacío.");
        }
    }
}