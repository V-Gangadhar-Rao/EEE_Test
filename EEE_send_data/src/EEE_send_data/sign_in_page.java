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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class sign_in_page {

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
					sign_in_page window = new sign_in_page();
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
	public sign_in_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 591, 646);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(192, 61, 152, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblName.setBounds(49, 177, 152, 43);
		frame.getContentPane().add(lblName);
		
		JLabel lblUserId = new JLabel("User Id");
		lblUserId.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUserId.setBounds(49, 299, 152, 43);
		frame.getContentPane().add(lblUserId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPassword.setBounds(49, 407, 152, 43);
		frame.getContentPane().add(lblPassword);
		
		tb1 = new JTextField();
		tb1.setBounds(233, 177, 219, 39);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setColumns(10);
		tb2.setBounds(233, 292, 219, 39);
		frame.getContentPane().add(tb2);
		
		tb3 = new JTextField();
		tb3.setColumns(10);
		tb3.setBounds(233, 407, 219, 39);
		frame.getContentPane().add(tb3);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String un=tb2.getText();
				String p=tb3.getText();
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EEE","root","336699");
					String q="select count(*) from userdata where name=? and password=?";
					PreparedStatement ps=con.prepareStatement(q);
					ps.setString(1,un);
					ps.setString(2, p);
					ResultSet rs=ps.executeQuery();
					rs.next();
					int c=rs.getInt(1);
					if(c==0)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Invalid");
						
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "Hello"+n+"\n Login Done");
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(170, 500, 174, 43);
		frame.getContentPane().add(btnNewButton);
	}

}
