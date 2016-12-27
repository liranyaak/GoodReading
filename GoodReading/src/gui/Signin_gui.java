package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;

import java.awt.Choice;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
    
public class Signin_gui extends JPanel  {
	
	public JButton BackButton;
	public JButton SendButton; 
	public JTextPane IDtextPane;
	public JTextPane F_MANEtextPane;
	public JTextPane L_NAMEtextPane;
	public JTextPane PASStextPane;
	public JTextPane EMAILtextPane;
	public JTextPane  CARDtextPane;
	
	
	
	public Signin_gui() {
		setBackground(Color.WHITE);
		
		this.setSize(750,650);
		this.setLayout(null);
		Checks check=new Checks();
		
		JLabel lblSgin = new JLabel("Sign-in");
		lblSgin.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblSgin.setBounds(309, 11, 170, 66);
		add(lblSgin);
		
		IDtextPane = new JTextPane();
		IDtextPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		IDtextPane.setBackground(Color.LIGHT_GRAY);
		IDtextPane.setBounds(272, 139, 227, 35);
		add(IDtextPane);
		 
		JLabel IDlblId = new JLabel("ID:");
		IDlblId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		IDlblId.setBounds(214, 139, 39, 35);
		add(IDlblId);
		
	    F_MANEtextPane = new JTextPane();
		F_MANEtextPane.setBackground(Color.LIGHT_GRAY);
		F_MANEtextPane.setBounds(272, 183, 227, 35);
		add(F_MANEtextPane);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFirstName.setBounds(153, 198, 118, 20);
		add(lblFirstName);
		
		L_NAMEtextPane = new JTextPane();
		L_NAMEtextPane.setBackground(Color.LIGHT_GRAY);
		L_NAMEtextPane.setBounds(272, 229, 227, 36);
		add(L_NAMEtextPane);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastName.setBounds(153, 239, 118, 27);
		add(lblLastName);
		
		PASStextPane = new JTextPane();
		PASStextPane.setBackground(Color.LIGHT_GRAY);
		PASStextPane.setBounds(272, 277, 227, 35);
		add(PASStextPane);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(159, 287, 102, 27);
		add(lblPassword);
		
		
		
		EMAILtextPane = new JTextPane();
		EMAILtextPane.setBackground(Color.LIGHT_GRAY);
		EMAILtextPane.setBounds(271, 323, 228, 35);
		add(EMAILtextPane);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(190, 331, 63, 27);
		add(lblEmail);
		
		CARDtextPane= new JTextPane();
		CARDtextPane.setBackground(Color.LIGHT_GRAY);
		CARDtextPane.setBounds(272, 369, 227, 35);
		add(CARDtextPane);
		
		JLabel lblCreditCard = new JLabel("Credit Card: ");
		lblCreditCard.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCreditCard.setBounds(143, 384, 102, 20);
		add(lblCreditCard);
		
		
		Choice choice = new Choice();
		choice.setBounds(272, 421, 227, 29);
		add(choice);
		choice.add("year");
		choice.add("Half year");
		choice.add("Without Mambership ");
		
		JLabel lblMambership = new JLabel("Mambership");
		lblMambership.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMambership.setBounds(143, 421, 112, 20);
		add(lblMambership);
		
		
		 SendButton = new JButton("Send Requst");
		 SendButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
		SendButton.setBounds(502, 510, 203, 65);
		add(SendButton);
		
		BackButton = new JButton("Back");
		BackButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
		BackButton.setBounds(37, 510, 203, 65);
		add(BackButton);
		

	
   }
}
