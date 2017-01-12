package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

public class ReviewDisplayGui extends JPanel {
	public JTextPane textPaneReviewerId,textPaneReviewerName,textPaneDate;
	public JButton btnBack;
	public JTextArea textAreaContent;
	/**
	 * Create the panel.
	 */
	public ReviewDisplayGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Review");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblNewLabel.setBounds(269, 43, 178, 55);
		add(lblNewLabel);
		
		JLabel lblReviewerId = new JLabel("Reviewer ID:");
		lblReviewerId.setBounds(60, 110, 178, 33);
		add(lblReviewerId);
		
		textPaneReviewerId = new JTextPane();
		textPaneReviewerId.setBackground(Color.LIGHT_GRAY);
		textPaneReviewerId.setEditable(false);
		textPaneReviewerId.setBounds(266, 110, 200, 33);
		add(textPaneReviewerId);
		
		JLabel lblReviewerName = new JLabel("Reviewer Name:");
		lblReviewerName.setBounds(60, 160, 200, 33);
		add(lblReviewerName);
		
		textPaneReviewerName = new JTextPane();
		textPaneReviewerName.setBackground(Color.LIGHT_GRAY);
		textPaneReviewerName.setEditable(false);
		textPaneReviewerName.setBounds(266, 160, 200, 33);
		add(textPaneReviewerName);
		
		JLabel lblContent = new JLabel("Content:");
		lblContent.setBounds(60, 268, 115, 33);
		add(lblContent);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnBack.setBounds(64, 581, 171, 41);
		add(btnBack);
		
		JLabel lblDateOfSending = new JLabel("Date Of sending:");
		lblDateOfSending.setBounds(60, 210, 216, 50);
		add(lblDateOfSending);
		
		textPaneDate = new JTextPane();
		textPaneDate.setEditable(false);
		textPaneDate.setBackground(Color.LIGHT_GRAY);
		textPaneDate.setBounds(266, 221, 200, 33);
		add(textPaneDate);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(180, 300, 445, 268);
		add(scrollPane);
		
		textAreaContent = new JTextArea();
		scrollPane.setViewportView(textAreaContent);
		textAreaContent.setBackground(Color.LIGHT_GRAY);
		textAreaContent.setEditable(false);

	}
}
