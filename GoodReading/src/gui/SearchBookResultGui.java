package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;

public class SearchBookResultGui extends JPanel {
	private JTable table;
	public JTextPane textPaneBookId;
	public JButton OKButton;
    public JButton BackButton;
	/**
	 * Create the panel.
	 */
	public SearchBookResultGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search Result");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblNewLabel.setBounds(217, 28, 358, 58);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(91, 105, 552, 329);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Please  Enter Wented Book Id:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(91, 459, 245, 33);
		add(lblNewLabel_1);
		
		textPaneBookId = new JTextPane();
		textPaneBookId.setBackground(Color.LIGHT_GRAY);
		textPaneBookId.setBounds(293, 459, 350, 33);
		add(textPaneBookId);
		
		OKButton = new JButton("Ok");
		OKButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		OKButton.setBounds(472, 532, 171, 50);
		add(OKButton);
		
	    BackButton = new JButton("Back");
		BackButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		BackButton.setBounds(91, 532, 171, 50);
		add(BackButton);

	}
}
