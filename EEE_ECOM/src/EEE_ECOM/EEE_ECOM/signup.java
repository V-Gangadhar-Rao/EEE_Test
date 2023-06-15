package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class signup {

	private JFrame frame;
	private JTextField tb1;
	private JCheckBox cb2;
	private JCheckBox cb3;
	private JCheckBox cb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
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
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 857, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SignUp");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 37));
		lblNewLabel.setBounds(329, 89, 129, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(91, 202, 103, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(355, 202, 201, 41);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gender");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(91, 309, 144, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Branch");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(91, 406, 163, 41);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Programming");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_3.setBounds(91, 483, 183, 41);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JRadioButton rb1 = new JRadioButton("Male");
		rb1.setFont(new Font("Tahoma", Font.BOLD, 18));
		rb1.setBounds(355, 307, 113, 43);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Female");
		rb2.setFont(new Font("Tahoma", Font.BOLD, 18));
		rb2.setBounds(488, 307, 103, 43);
		frame.getContentPane().add(rb2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		JComboBox cb = new JComboBox();
		cb.setFont(new Font("Tahoma", Font.BOLD, 18));
		cb.setModel(new DefaultComboBoxModel(new String[] {"Select", "EEE", "CSE", "ECE", "MEC"}));
		cb.setBounds(365, 416, 201, 32);
		frame.getContentPane().add(cb);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String g;
				if(rb1.isSelected())
				{g="Male";
			
				}
				else if(rb2.isSelected())
				{
					g="Female";
				
				}
				else
				{
					g="invalid";
				}
				String b=(String)cb.getSelectedItem();
				String p;
				if(cb1.isSelected())
				{
					p="JAVA";
				
				}
				else if(cb2.isSelected())
				{
					p="PYTHON";
				}
				else 
				{
					p="C";
				}
				JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+"\n gender:"+g+"\n Branch"+b+"\n programming"+p);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(336, 588, 154, 41);
		frame.getContentPane().add(btnNewButton);
		
		cb1 = new JCheckBox("JAVA");
		cb1.setFont(new Font("Tahoma", Font.BOLD, 17));
		cb1.setBounds(355, 489, 103, 41);
		frame.getContentPane().add(cb1);
		
		cb2 = new JCheckBox("PYTHON");
		cb2.setFont(new Font("Tahoma", Font.BOLD, 17));
		cb2.setBounds(499, 489, 103, 41);
		frame.getContentPane().add(cb2);
		
		cb3 = new JCheckBox("C");
		cb3.setFont(new Font("Tahoma", Font.BOLD, 17));
		cb3.setBounds(641, 489, 103, 41);
		frame.getContentPane().add(cb3);
	}
}
