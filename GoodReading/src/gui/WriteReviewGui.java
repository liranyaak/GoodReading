package gui;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class WriteReviewGui extends JPanel {
	JButton btnBack,btnOk;
	JTextArea textAreaReview;
	/**
	 * Create the panel.
	 */
	public WriteReviewGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(85, 175, 589, 375);
		add(scrollPane);
		
		textAreaReview = new JTextArea();
		textAreaReview.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(textAreaReview);
		
		JLabel lblNewLabel = new JLabel("Write a Review");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblNewLabel.setBounds(205, 28, 359, 53);
		add(lblNewLabel);
		
		JLabel lblPleaseTypeYour = new JLabel("Please Type Your Review:");
		lblPleaseTypeYour.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPleaseTypeYour.setBounds(88, 117, 327, 33);
		add(lblPleaseTypeYour);
		
		btnOk = new JButton("Send");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnOk.setBounds(504, 561, 171, 41);
		add(btnOk);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnBack.setBounds(85, 561, 171, 41);
		add(btnBack);

	}
}
