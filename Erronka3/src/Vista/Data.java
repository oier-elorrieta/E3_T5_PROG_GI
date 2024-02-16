package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Data extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contentPaneData;

	/**
	 * Create the panel.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data frame = new Data();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				}
			});
		}
		
	public Data() {
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPaneData = new JPanel();
			contentPaneData.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPaneData);
			contentPaneData.setLayout(null);
		
	}
}
