package gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ReviewCheackingGui extends JPanel {

	public JButton btnApprove,btnReject, btnBack;
	public JTextPane textPaneTitle,textPaneReviewerId,textPaneReviewerName;
	public JTextArea textAreaReview;
	
	/**
	 * Create the panel.
	 */
	public ReviewCheackingGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		btnApprove = new JButton("Approve");
		btnApprove.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnApprove.setBounds(494, 570, 171, 41);
		add(btnApprove);
		
		btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnReject.setBounds(278, 570, 171, 41);
		add(btnReject);
		
		JLabel lblCheckingReview = new JLabel("Checking Review");
		lblCheckingReview.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblCheckingReview.setBounds(167, 28, 392, 55);
		add(lblCheckingReview);
		
		JLabel lblYouCanEdit = new JLabel("You Can Edit the Review In This Window");
		lblYouCanEdit.setBounds(62, 105, 497, 33);
		add(lblYouCanEdit);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(72, 166, 115, 33);
		add(lblTitle);
		
		textPaneTitle = new JTextPane();
		textPaneTitle.setBackground(Color.LIGHT_GRAY);
		textPaneTitle.setEditable(false);
		textPaneTitle.setBounds(147, 166, 150, 33);
		add(textPaneTitle);
		
		JLabel lblReviewerId = new JLabel("Reviewer Id:");
		lblReviewerId.setBounds(341, 166, 179, 33);
		add(lblReviewerId);
		
		textPaneReviewerId = new JTextPane();
		textPaneReviewerId.setBackground(Color.LIGHT_GRAY);
		textPaneReviewerId.setBounds(515, 166, 150, 33);
		add(textPaneReviewerId);
		
		textPaneReviewerName = new JTextPane();
		textPaneReviewerName.setBackground(Color.LIGHT_GRAY);
		textPaneReviewerName.setEditable(false);
		textPaneReviewerName.setBounds(320, 227, 200, 33);
		add(textPaneReviewerName);
		
		JLabel lblReviewerFullName = new JLabel("Reviewer Full Name:");
		lblReviewerFullName.setBounds(62, 227, 263, 33);
		add(lblReviewerFullName);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 335, 603, 218);
		add(scrollPane);
		
		textAreaReview = new JTextArea();
		scrollPane.setViewportView(textAreaReview);
		textAreaReview.setBackground(Color.LIGHT_GRAY);
		textAreaReview.setForeground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("Review:");
		lblNewLabel.setBounds(62, 288, 115, 33);
		add(lblNewLabel);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnBack.setBounds(62, 570, 171, 41);
		add(btnBack);

	}
}
