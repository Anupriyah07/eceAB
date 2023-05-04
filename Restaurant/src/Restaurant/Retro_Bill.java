package Restaurant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Retro_Bill {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retro_Bill window = new Retro_Bill();
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
	public Retro_Bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 1103, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\"Anu's Restro\"");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(417, 36, 299, 58);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu:");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(145, 143, 178, 58);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qnty:");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(145, 272, 178, 67);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select:", "Chicken Mandi-399/-", "Chicken Biryani-401/-", "Pasta-350/-", "French Fries-200/-"}));
		c1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		c1.setBounds(396, 134, 320, 67);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select:", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		c2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		c2.setBounds(396, 280, 320, 67);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Ok!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=(String) c2.getSelectedItem();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("Chicken Mandi-399/-"))
				{
					bill=q*399;
					JOptionPane.showMessageDialog(btnNewButton, "WELCOME TO ANUS RESTRO! \nSelected Item:"+item+"\nQnty: "+q+" \nYour Bill is: "+bill);
				}
				else if(item.equals("Chicken Biryani-401/-"))
				{
					bill=q*401;
					JOptionPane.showMessageDialog(btnNewButton, "WELCOME TO ANUS RESTRO! \nSelected Item:"+item+"\nQnty: "+q+" \nYour Bill is: "+bill);
				}
				else if(item.equals("Pasta-350/-"))
				{
					bill=q*350;
					JOptionPane.showMessageDialog(btnNewButton, "WELCOME TO ANUS RESTRO! \nSelected Item:"+item+"\nQnty: "+q+" \nYour Bill is: "+bill);
				}
				else if(item.equals("French Fries-200/-"))
				{
					bill=q*200;
					JOptionPane.showMessageDialog(btnNewButton, "WELCOME TO ANUS RESTRO! \nSelected Item:"+item+"\nQnty: "+q+" \nYour Bill is: "+bill);
				}
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 32));
		btnNewButton.setBounds(453, 419, 171, 58);
		frame.getContentPane().add(btnNewButton);
	}
}
