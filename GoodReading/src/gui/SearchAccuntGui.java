package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;

public class SearchAccuntGui extends JPanel {
	public JLabel lblMainTitle;
	public JTextPane textPaneSearchId;
	JButton btnSearch,btnBack;
	/**
	 * Create the panel.
	 */
	public SearchAccuntGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		lblMainTitle = new JLabel("Search Accunt");
		lblMainTitle.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblMainTitle.setBounds(219, 28, 358, 53);
		add(lblMainTitle);
		
		JLabel lblEnterUserId = new JLabel("Enter User Id:");
		lblEnterUserId.setBounds(63, 139, 198, 33);
		add(lblEnterUserId);
		
		textPaneSearchId = new JTextPane();
		textPaneSearchId.setBackground(Color.LIGHT_GRAY);
		textPaneSearchId.setBounds(261, 139, 220, 33);
		add(textPaneSearchId);
		
		btnSearch = new JButton("Search");
		btnSearch.setBounds(452, 496, 171, 41);
		add(btnSearch);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(130, 496, 171, 41);
		add(btnBack);

	}
}
