package Vista;

import javax.swing.*;
import Modelo.Bezeroa;
import DAO.BezeroaDAO;

public class BezeroakUI extends JFrame {

    private JPanel contentPane;
    private JComboBox<Bezeroa> comboBoxBezeroak;

    public BezeroakUI() {
        setTitle("Bezeroak");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        comboBoxBezeroak = new JComboBox<>();
        comboBoxBezeroak.setBounds(10, 10, 150, 20);
        contentPane.add(comboBoxBezeroak);

        // Obtener la lista de clientes desde la base de datos
        BezeroaDAO bezeroaDAO = new BezeroaDAO();
        Bezeroa[] bezeroak = bezeroaDAO.getAllBezeroak();
        for (Bezeroa bezeroa : bezeroak) {
            comboBoxBezeroak.addItem(bezeroa);
        }

        // Agregar un listener para el combo box para abrir una nueva ventana con los detalles del cliente seleccionado
        comboBoxBezeroak.addActionListener(e -> {
            Bezeroa selectedBezeroa = (Bezeroa) comboBoxBezeroak.getSelectedItem();
            if (selectedBezeroa != null) {
                // Pedir nombre de usuario y contraseña
                String username = JOptionPane.showInputDialog(this, "Introduce tu nombre de usuario:");
                String password = JOptionPane.showInputDialog(this, "Introduce tu contraseña:");

                // Validar nombre de usuario y contraseña
                if (selectedBezeroa.getErabiltzailea().equals(username) && selectedBezeroa.getPasahitza().equals(password)) {
                    // Crear una nueva ventana con detalles adicionales del cliente seleccionado
                    showClienteDetails(selectedBezeroa);
                } else {
                    JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos.");
                }
            }
        });
    }

    private void showClienteDetails(Bezeroa bezeroa) {
        // Crear una nueva ventana para mostrar los detalles del cliente seleccionado
        JFrame frame = new JFrame("Detalles del Cliente");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);

        // Crear un JTextArea para mostrar los detalles del cliente
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.append("Nombre: " + bezeroa.getIzena() + "\n");
        textArea.append("Apellido: " + bezeroa.getAbizena() + "\n");
        textArea.append("NAN: " + bezeroa.getNan() + "\n");
        textArea.append("Sexo: " + bezeroa.getSexua() + "\n");

        // Agregar el JTextArea al JFrame
        frame.add(new JScrollPane(textArea));

        // Hacer visible la nueva ventana
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BezeroakUI frame = new BezeroakUI();
            frame.setVisible(true);
        });
    }
}
