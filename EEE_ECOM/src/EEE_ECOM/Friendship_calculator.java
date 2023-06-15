package EEE_ECOM;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Friendship_calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Friendship_calculator window = new Friendship_calculator();
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
	public Friendship_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.getContentPane().setBackground(new Color(250, 235, 215));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Friendship Calculator ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(52, 58, 380, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your Name ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_1.setBounds(137, 180, 128, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("CHECK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r=new Random();
				int n=r.nextInt(1,100); 
				lb.setText(n+"%");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.setBounds(103, 507, 169, 43);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(103, 235, 162, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Their Name ");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_1_2.setBounds(144, 299, 128, 21);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 334, 169, 54);
		frame.getContentPane().add(textField_1);
		
		lb = new JLabel("");
		lb.setFont(new Font("Tahoma", Font.PLAIN, 64));
		lb.setBounds(119, 420, 138, 77);
		frame.getContentPane().add(lb);
		frame.setBounds(100, 100, 411, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
