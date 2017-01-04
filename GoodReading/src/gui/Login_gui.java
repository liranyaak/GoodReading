package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Login_gui extends JPanel  {
	
	public JButton loginButton ;
	public JButton singinButton;
	public JTextPane IDtextPane;
	public JPasswordField passwordField;
	public JButton btnAbout;
	public Login_gui()
	{
		super();
		setBackground(Color.WHITE);
		Checks check=new Checks();
		this.setSize( 450,450 );
		setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(210, 5, 0, 0);
		add(label);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(95, 149, 46, 20);
		add(lblId);
		
		IDtextPane = new JTextPane();
		IDtextPane.setBounds(139, 149, 162, 20);
		IDtextPane.setBackground(Color.LIGHT_GRAY);
		IDtextPane.setForeground(Color.BLACK);
		add(IDtextPane);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(58, 195, 80, 20);
		add(lblPassword);
		
	    loginButton = new JButton("Log-in");
	    loginButton.setBounds(84, 249, 261, 37);
	    loginButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(loginButton);
		
	    singinButton = new JButton("Sign-in");
	    singinButton.setBounds(84, 297, 261, 34);
	    singinButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(singinButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(58, 5, 322, 133);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\u05DC\u05D9\u05E8\u05DF\\Desktop\\workspace\\GUI_pro\\\u05DC\u05D5\u05D2\u05D5_320x137.jpg"));
		add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(139, 195, 162, 20);
		passwordField.setBackground(Color.LIGHT_GRAY);
		add(passwordField);
		
		btnAbout = new JButton("About");
		btnAbout.setBounds(25, 364, 89, 23);
		add(btnAbout);
	
		
		
	}
}
