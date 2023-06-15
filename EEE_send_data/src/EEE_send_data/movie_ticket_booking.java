package EEE_send_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class movie_ticket_booking {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie_ticket_booking window = new movie_ticket_booking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public movie_ticket_booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 899, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String n = tb1.getText();
				String b=(String)tb2.getSelectedItem();
				String c=(String)tb3.getSelectedItem();
				
				JOptionPane.showMessageDialog(lblNewLabel_3, "Hello"+n+"Movie"+b+"Tickets"+c+"\n Booking Confirmed");
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\pandu\\OneDrive\\Pictures\\Screenshots\\ss1.png"));
		lblNewLabel_3.setBounds(561, 234, 279, 95);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(388, 41, 45, 13);
		frame.getContentPane().add(lblNewLabel);
	}
}
