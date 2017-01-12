package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.Color;

public class ReviwsForBookListGui extends JPanel {
	public JList listReview;
	public JButton btnOk,btnBack;
	/**
	 * Create the panel.
	 */
	public ReviwsForBookListGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblReviewsForBook = new JLabel("Reviews For Book");
		lblReviewsForBook.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblReviewsForBook.setBounds(165, 28, 395, 69);
		add(lblReviewsForBook);
		
		JLabel lblPleaseChooseReview = new JLabel("Please Choose Review Form The List");
		lblPleaseChooseReview.setBounds(50, 125, 513, 33);
		add(lblPleaseChooseReview);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 196, 642, 312);
		add(scrollPane);
		
		listReview = new JList();
		listReview.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(listReview);
		
		btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnOk.setBounds(521, 581, 171, 41);
		add(btnOk);
		
	    btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnBack.setBounds(50, 581, 171, 41);
		add(btnBack);

	}
}
