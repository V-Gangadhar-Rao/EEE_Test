package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class metro_ticket_booking {

	private JFrame frame;
	private JTextField tb1;
	private JComboBox c3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro_ticket_booking window = new metro_ticket_booking();
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
	public metro_ticket_booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1038, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("NAME ");
		lblName.setFont(new Font("Arial", Font.BOLD, 19));
		lblName.setBounds(238, 206, 82, 32);
		frame.getContentPane().add(lblName);
		
		tb1 = new JTextField();
		tb1.setBounds(488, 210, 256, 32);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblFrom = new JLabel("FROM");
		lblFrom.setFont(new Font("Arial", Font.BOLD, 19));
		lblFrom.setBounds(238, 289, 82, 32);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setFont(new Font("Arial", Font.BOLD, 19));
		lblTo.setBounds(238, 377, 82, 32);
		frame.getContentPane().add(lblTo);
		
		JLabel lblTicket = new JLabel("TICKETS");
		lblTicket.setFont(new Font("Arial", Font.BOLD, 19));
		lblTicket.setBounds(238, 467, 96, 32);
		frame.getContentPane().add(lblTicket);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 18));
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "HYDERABAD", "MOOSAPET ", "AMEERPT", "BALANAGAR"}));
		c1.setBounds(488, 292, 256, 32);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Tahoma", Font.BOLD, 18));
		c2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "HYDERABAD", "MOOSAPET ", "AMEERPT", "BALANAGAR"}));
		c2.setBounds(488, 377, 256, 32);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("CONFIRM ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=tb1.getText();
				String fr=(String)c1.getSelectedItem();
				String to=(String)c2.getSelectedItem();
				String tickets=(String)c3.getSelectedItem();
				int t=Integer.parseInt(tickets);
				int bill=t*40;
			//	JOptionPane.showMessageDialog(btnNewButton, "Hello"+un+"\n From :"+fr+"\n To :"+to+"\n Tickets :"+t+"\n Bill :"+bill
						//+ "\n BOOKING CONFIMED ");
				
				if(to.equals("SELECT"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Select to station");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Hello"+un+"\n From :"+fr+"\n To :"+to+"\n Tickets :"+t+"\n Bill :"+bill
							+ "\n BOOKING CONFIMED ");	
				}
			
				
			}});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(396, 562, 175, 32);
		frame.getContentPane().add(btnNewButton);
		
		c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5"}));
		c3.setFont(new Font("Tahoma", Font.BOLD, 18));
		c3.setBounds(488, 467, 256, 32);
		frame.getContentPane().add(c3);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(51, 204, 255));
		panel.setBounds(10, 10, 1004, 178);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING ");
		lblNewLabel.setBounds(178, 65, 674, 58);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pandu\\Downloads\\metro_logo-removebg-preview.png"));
		lblNewLabel_1.setBounds(839, 10, 176, 166);
		panel.add(lblNewLabel_1);
	}
}
