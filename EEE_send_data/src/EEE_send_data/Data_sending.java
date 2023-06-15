package EEE_send_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Data_sending {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data_sending window = new Data_sending();
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
	public Data_sending() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 181));
		frame.setBackground(new Color(175, 238, 238));
		frame.setBounds(100, 100, 715, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SNo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(143, 169, 92, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblName.setBounds(143, 280, 92, 52);
		frame.getContentPane().add(lblName);
		
		JLabel lblMarka = new JLabel("Marks");
		lblMarka.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblMarka.setBounds(143, 384, 92, 52);
		frame.getContentPane().add(lblMarka);
		
		tb1 = new JTextField();
		tb1.setBounds(386, 171, 152, 38);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setColumns(10);
		tb2.setBounds(386, 294, 152, 38);
		frame.getContentPane().add(tb2);
		
		tb3 = new JTextField();
		tb3.setColumns(10);
		tb3.setBounds(386, 384, 152, 38);
		frame.getContentPane().add(tb3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tb1.getText();
				int sn=Integer.parseInt(s);
				String n=tb2.getText();
				String m=tb3.getText();
				float ma=Float.parseFloat(m);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EEE","root","336699");
					String q="insert into student values('"+sn+"','"+n+"','"+ma+"')";
					Statement sta=con.createStatement();
					sta.execute(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "Done");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
					
			  
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(276, 486, 152, 38);
		frame.getContentPane().add(btnNewButton);
	}
}
