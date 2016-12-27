package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;

public class BookListToReviewGui extends JPanel {
	public JTable table;
    public JButton backButton;
    public JButton OKbtnNewButton;
    JTextPane textPaneBookId;
    
	/**
	 * Create the panel.
	 */
	public BookListToReviewGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your Book List To Review");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblNewLabel.setBounds(91, 39, 584, 43);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please Enter Book Id To Review");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(61, 434, 238, 33);
		add(lblNewLabel_1);
		
		backButton = new JButton("Back");
		backButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		backButton.setBounds(78, 506, 186, 56);
		add(backButton);
		
		textPaneBookId = new JTextPane();
		textPaneBookId.setBackground(Color.LIGHT_GRAY);
		textPaneBookId.setBounds(309, 434, 357, 33);
		add(textPaneBookId);
		
		OKbtnNewButton = new JButton("Ok");
		OKbtnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		OKbtnNewButton.setBounds(477, 506, 196, 56);
		add(OKbtnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 102, 605, 295);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}
