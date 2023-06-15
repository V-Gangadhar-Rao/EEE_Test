package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Panel;
import javax.swing.BoxLayout;

public class ECOMERS {

	private JFrame frame;
	int i=0;
	int b=0;
	private JLabel lb1;
	private JLabel lb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECOMERS window = new ECOMERS();
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
	public ECOMERS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1072, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pandu\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-06-13 111719.png"));
		lblNewLabel_1.setBounds(73, 206, 164, 175);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\pandu\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-06-13 111639.png"));
		lblNewLabel_1_1.setBounds(427, 188, 164, 210);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\pandu\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-06-13 111601.png"));
		lblNewLabel_1_2.setBounds(799, 197, 164, 193);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "RED", "GREEN", "YELLOW"}));
		comboBox.setBounds(99, 486, 115, 31);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "RED", "GREEN", "YELLOW"}));
		comboBox_1.setBounds(452, 486, 117, 31);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "RED", "GREEN", "YELLOW"}));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBox_2.setBounds(842, 486, 121, 31);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("ADD TO CART ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb1.setText("CART :"+i);
				b=b+199;
				lb2.setText("Bill:"+b);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(99, 535, 115, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb1.setText("CART :"+i);
				b=b+299;
				lb2.setText("Bill:"+b);
			}
		});
		btnAddToCart.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddToCart.setBounds(452, 538, 117, 36);
		frame.getContentPane().add(btnAddToCart);
		
		JButton btnAddToCart_1 = new JButton("ADD TO CART");
		btnAddToCart_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb1.setText("CART :"+i);
				b=b+399;
				lb2.setText("Bill:"+b);
			}
		});
		btnAddToCart_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAddToCart_1.setBounds(842, 541, 121, 31);
		frame.getContentPane().add(btnAddToCart_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs-199");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(116, 433, 65, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Rs-299");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_3.setBounds(477, 433, 65, 31);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rs-399");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(862, 433, 65, 31);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 204, 153));
		panel.setBounds(0, 0, 1058, 136);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMAZON");
		lblNewLabel.setBounds(397, 37, 254, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 46));
		
		lb1 = new JLabel("CART : 0");
		lb1.setBounds(944, 10, 104, 21);
		panel.add(lb1);
		lb1.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		lb2 = new JLabel("Bill : O");
		lb2.setBounds(957, 60, 91, 21);
		panel.add(lb2);
		lb2.setFont(new Font("Tahoma", Font.BOLD, 17));
	}
}
