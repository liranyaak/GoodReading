package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;

public class ReviewToCheckGui extends JPanel {
	private JTable table;
	public JTextPane textPaneReviewToCheck;
	public JButton btnOk,btnBack;

	/**
	 * Create the panel.
	 */
	public ReviewToCheckGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Uncheckd Reviews");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblNewLabel.setBounds(160, 28, 434, 53);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 109, 558, 354);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblReviewNumTo = new JLabel("Review Num To Cheack:");
		lblReviewNumTo.setBounds(96, 491, 297, 33);
		add(lblReviewNumTo);
		
		textPaneReviewToCheck = new JTextPane();
		textPaneReviewToCheck.setBackground(Color.LIGHT_GRAY);
		textPaneReviewToCheck.setBounds(411, 491, 180, 33);
		add(textPaneReviewToCheck);
		
		btnOk = new JButton("Ok");
	    btnOk.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnOk.setBounds(473, 563, 171, 41);
		add(btnOk);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnBack.setBounds(86, 563, 171, 41);
		add(btnBack);

	}
}