package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class ReportDisplayReaderGui extends JPanel {
	JButton btnGetReport,btnBack;
	JTextPane textPaneId,textPaneFirstName,textPaneLastName,textPanePassword,textPaneEmail,textPaneCraditCardNum,textPaneMambership;

	/**
	 * Create the panel.
	 */
	public ReportDisplayReaderGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblSgininRequstDisplay = new JLabel("Sgin-In Requst Display");
		lblSgininRequstDisplay.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblSgininRequstDisplay.setBounds(103, 28, 527, 69);
		add(lblSgininRequstDisplay);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(26, 140, 39, 33);
		add(lblId);
		
		textPaneId = new JTextPane();
		textPaneId.setEditable(false);
		textPaneId.setBackground(Color.LIGHT_GRAY);
		textPaneId.setBounds(275, 140, 220, 33);
		add(textPaneId);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(26, 180, 156, 33);
		add(lblFirstName);
		
		textPaneFirstName = new JTextPane();
		textPaneFirstName.setBackground(Color.LIGHT_GRAY);
		textPaneFirstName.setEditable(false);
		textPaneFirstName.setBounds(275, 180, 220, 33);
		add(textPaneFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(26, 220, 156, 33);
		add(lblLastName);
		
		textPaneLastName = new JTextPane();
		textPaneLastName.setEditable(false);
		textPaneLastName.setBackground(Color.LIGHT_GRAY);
		textPaneLastName.setBounds(275, 220, 220, 33);
		add(textPaneLastName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(26, 260, 145, 33);
		add(lblPassword);
		
		textPanePassword = new JTextPane();
		textPanePassword.setBackground(Color.LIGHT_GRAY);
		textPanePassword.setEditable(false);
		textPanePassword.setBounds(275, 260, 220, 33);
		add(textPanePassword);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(26, 300, 115, 33);
		add(lblEmail);
		
		textPaneEmail = new JTextPane();
		textPaneEmail.setEditable(false);
		textPaneEmail.setBackground(Color.LIGHT_GRAY);
		textPaneEmail.setBounds(275, 300, 220, 33);
		add(textPaneEmail);
		
		JLabel lblCraditCardNum = new JLabel("Cardit Card Number:");
		lblCraditCardNum.setBounds(26, 340, 280, 33);
		add(lblCraditCardNum);
		
		textPaneCraditCardNum = new JTextPane();
		textPaneCraditCardNum.setBackground(Color.LIGHT_GRAY);
		textPaneCraditCardNum.setEditable(false);
		textPaneCraditCardNum.setBounds(275, 340, 220, 33);
		add(textPaneCraditCardNum);
		
		JLabel lblMambership = new JLabel("Mambership:");
		lblMambership.setBounds(26, 380, 200, 33);
		add(lblMambership);
		
		textPaneMambership = new JTextPane();
		textPaneMambership.setEditable(false);
		textPaneMambership.setBackground(Color.LIGHT_GRAY);
		textPaneMambership.setBounds(275, 380, 220, 33);
		add(textPaneMambership);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnBack.setBounds(26, 551, 171, 41);
		add(btnBack);
		
		btnGetReport = new JButton("Get Report");
		btnGetReport.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnGetReport.setBounds(553, 551, 171, 41);
		add(btnGetReport);
	}

}
