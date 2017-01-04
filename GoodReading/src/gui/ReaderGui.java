package gui;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ReaderGui extends JPanel {

	
	public JButton btnLogout;
	public JButton btnBookSearch;
	public JButton NotificationButton;
	public JButton btnWriteAReview;
	public JLabel lblHi;
	/**
	 * Create the panel.
	 */
	public ReaderGui(String s) {
		setBackground(Color.WHITE);
		
		setLayout(null);
		String name = new String(s);
		
		JLabel lblNewLabel = new JLabel(name+" Main Manu");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblNewLabel.setBounds(138, 82, 494, 83);
		add(lblNewLabel);
		
		NotificationButton = new JButton("Notification");
		NotificationButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		NotificationButton.setBounds(26, 28, 171, 41);
		add(NotificationButton);
		
	    btnBookSearch = new JButton("Book Search");
		btnBookSearch.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnBookSearch.setBounds(72, 166, 560, 30);
		add(btnBookSearch);
		
		btnWriteAReview = new JButton("Write a Review");
		btnWriteAReview.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnWriteAReview.setBounds(72, 211, 560, 30);
		add(btnWriteAReview);
		
		btnLogout = new JButton("Log-Out");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnLogout.setBounds(534, 564, 171, 41);
		add(btnLogout);
		
		lblHi = new JLabel("HI!");
		lblHi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHi.setBounds(563, 47, 187, 24);
		add(lblHi);
		
		
	
	}
	
	}
	

