package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class BookDisplayGui extends JPanel {

	public JButton ReadReviewButton;
	public JButton BackButton;
	public JButton PurchaseButton;
	/**
	 * Create the panel.
	 */
	public BookDisplayGui(/*Book b*/) {
		setBackground(Color.WHITE);
		setLayout(null);
		String s =new String();
		JLabel lblBookInfoCard = new JLabel("Book Info Card");
		lblBookInfoCard.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblBookInfoCard.setBounds(198, 28, 349, 51);
		add(lblBookInfoCard);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitle.setBounds(13, 80, 72, 33);
		add(lblTitle);
		
		JTextPane textPane = new JTextPane(/*b.getName*/);
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setEditable(false);
		textPane.setBounds(228, 80, 468, 33);
		add(textPane);
		
		JLabel lblAuthers = new JLabel("Authers:");
		lblAuthers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAuthers.setBounds(13, 123, 115, 33);
		add(lblAuthers);
		
		JTextPane textPane_1 = new JTextPane(/*b.getAuthers*/);
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setEditable(false);
		textPane_1.setBounds(228, 123, 468, 33);
		add(textPane_1);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSubject.setBounds(13, 166, 115, 33);
		add(lblSubject);
		
		JTextPane textPane_2 = new JTextPane(/*b.getSubject*/);
		textPane_2.setBackground(Color.LIGHT_GRAY);
		textPane_2.setEditable(false);
		textPane_2.setBounds(228, 166, 468, 33);
		add(textPane_2);
		
		JLabel lblRange = new JLabel("Range:");
		lblRange.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRange.setBounds(13, 209, 115, 33);
		add(lblRange);
		
		JTextPane textPane_3 = new JTextPane(/*b.getRange*/);
		textPane_3.setBackground(Color.LIGHT_GRAY);
		textPane_3.setEditable(false);
		textPane_3.setBounds(228, 209, 468, 33);
		add(textPane_3);
		
		JLabel lblLanguage = new JLabel("Language:");
		lblLanguage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLanguage.setBounds(13, 252, 152, 33);
		add(lblLanguage);
		
		JTextPane textPane_4 = new JTextPane(/*b.getLanguage*/);
		textPane_4.setBackground(Color.LIGHT_GRAY);
		textPane_4.setEditable(false);
		textPane_4.setBounds(228, 252, 468, 33);
		add(textPane_4);
		
		JLabel lblTableOfContext = new JLabel("Table Of Content:");
		lblTableOfContext.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTableOfContext.setBounds(13, 295, 223, 33);
		add(lblTableOfContext);
		
		JTextArea textArea = new JTextArea(/*b.getTableOfContent*/);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setEditable(false);
		textArea.setBounds(228, 295, 468, 85);
		add(textArea);
		
		JLabel lblSummery = new JLabel("Summery:");
		lblSummery.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSummery.setBounds(13, 405, 152, 33);
		add(lblSummery);
		
		JTextArea textArea_1 = new JTextArea(/*b.getSummery*/);
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setEditable(false);
		textArea_1.setBounds(228, 391, 468, 85);
		add(textArea_1);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCost.setBounds(13, 493, 115, 33);
		add(lblCost);
		
		JTextPane textPane_5 = new JTextPane(/*b.getCost*/);
		textPane_5.setBackground(Color.LIGHT_GRAY);
		textPane_5.setBounds(228, 487, 125, 33);
		add(textPane_5);
		
		PurchaseButton = new JButton("Purchase");
		PurchaseButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		PurchaseButton.setBounds(525, 551, 171, 41);
		add(PurchaseButton);
		
	    ReadReviewButton = new JButton("Read Review");
		ReadReviewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		ReadReviewButton.setBounds(338, 551, 171, 41);
		add(ReadReviewButton);
		
		 BackButton = new JButton("Back");
		BackButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		BackButton.setBounds(13, 551, 171, 41);
		add(BackButton);

	}
}
