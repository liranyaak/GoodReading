package gui;

import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;

public class PaymentRequstDisplayGui extends JPanel {
	JButton btnBack,btnAccept,btnReject;
	JTextPane textPanePaymentType,textPaneReaderId,textPaneBookTitle,textPaneCraditCardNum;

	/**
	 * Create the panel.
	 */
	public PaymentRequstDisplayGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblPaymentRequstDisplay = new JLabel("Payment Requst Display");
		lblPaymentRequstDisplay.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblPaymentRequstDisplay.setBounds(98, 28, 546, 59);
		add(lblPaymentRequstDisplay);
		
		JLabel lblReaderId = new JLabel("Reader Id:");
		lblReaderId.setBounds(26, 133, 151, 33);
		add(lblReaderId);
		
		textPaneReaderId = new JTextPane();
		textPaneReaderId.setBackground(Color.LIGHT_GRAY);
		textPaneReaderId.setEditable(false);
		textPaneReaderId.setBounds(280, 133, 200, 33);
		add(textPaneReaderId);
		
		JLabel lblBookTitle = new JLabel("Book Title:");
		lblBookTitle.setBounds(26, 193, 141, 33);
		add(lblBookTitle);
		
		textPaneBookTitle = new JTextPane();
		textPaneBookTitle.setBackground(Color.LIGHT_GRAY);
		textPaneBookTitle.setEditable(false);
		textPaneBookTitle.setBounds(280, 193, 200, 33);
		add(textPaneBookTitle);
		
		JLabel lblCraditCardNumber = new JLabel("Cradit Card Number:");
		lblCraditCardNumber.setBounds(26, 253, 278, 33);
		add(lblCraditCardNumber);
		
		textPaneCraditCardNum = new JTextPane();
		textPaneCraditCardNum.setBackground(Color.LIGHT_GRAY);
		textPaneCraditCardNum.setEditable(false);
		textPaneCraditCardNum.setBounds(280, 253, 200, 33);
		add(textPaneCraditCardNum);
		
		JLabel lblNewLabel = new JLabel("Payment Type:");
		lblNewLabel.setBounds(26, 303, 200, 33);
		add(lblNewLabel);
		
		textPanePaymentType = new JTextPane();
		textPanePaymentType.setBackground(Color.LIGHT_GRAY);
		textPanePaymentType.setEditable(false);
		textPanePaymentType.setBounds(280, 303, 200, 33);
		add(textPanePaymentType);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnBack.setBounds(26, 545, 171, 41);
		add(btnBack);
		
		btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnReject.setBounds(290, 545, 171, 41);
		add(btnReject);
		
		btnAccept = new JButton("Accept");
		btnAccept.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnAccept.setBounds(553, 545, 171, 41);
		add(btnAccept);

	}
}
