package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;

public class PaymentRequestListGui extends JPanel {
	public JList listRequst;
	public JButton btnOk,btnBack;
	public JLabel lblFirstTitle;

	/**
	 * Create the panel.
	 */
	public PaymentRequestListGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		lblFirstTitle = new JLabel("Payment Request");
		lblFirstTitle.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblFirstTitle.setBounds(163, 28, 420, 61);
		add(lblFirstTitle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(124, 145, 459, 384);
		add(scrollPane);
		
		listRequst = new JList();
		listRequst.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(listRequst);
		
	    btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnOk.setBounds(465, 581, 171, 41);
		add(btnOk);
		
	    btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnBack.setBounds(63, 581, 171, 41);
		add(btnBack);

	}
}
