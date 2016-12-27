package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;

public class SearchBookGui extends JPanel {

	
	public JTextPane TitletextPane;
	public JTextPane AutortextPane;
	public JTextPane SubjecttextPane;
	public JTextPane RangetextPane;
	public JTextPane KeyWordstextPane;
	public JButton BackButton;
	public JButton SearchbtnNewButton;
	
	/**
	 * Create the panel.
	 */
	public SearchBookGui() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblBookSearch = new JLabel("Book Search");
		lblBookSearch.setFont(new Font("Stencil", Font.PLAIN, 42));
		lblBookSearch.setBounds(191, 61, 303, 67);
		add(lblBookSearch);
		
		JLabel lblNewLabel = new JLabel("Title:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(166, 202, 71, 33);
		add(lblNewLabel);
		
		 TitletextPane = new JTextPane();
		 TitletextPane.setBackground(Color.LIGHT_GRAY);
		 TitletextPane.setForeground(Color.BLACK);
		 TitletextPane.setBounds(247, 202, 210, 33);
		add( TitletextPane);

		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAutor.setBounds(154, 246, 71, 33);
		add(lblAutor);
		
	    AutortextPane= new JTextPane();
	    AutortextPane.setBackground(Color.LIGHT_GRAY);
		AutortextPane.setForeground(Color.BLACK);
		AutortextPane.setBounds(247, 247, 210, 33);
		add(AutortextPane);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSubject.setBounds(143, 297, 71, 33);
		add(lblSubject);
		
		SubjecttextPane = new JTextPane();
		SubjecttextPane.setBackground(Color.LIGHT_GRAY);
		SubjecttextPane.setForeground(Color.BLACK);
		SubjecttextPane.setBounds(247, 296, 210, 33);
		add(SubjecttextPane);
		
		JLabel lblRange = new JLabel("Range:");
		lblRange.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRange.setBounds(153, 341, 71, 33);
		add(lblRange);
		
		RangetextPane = new JTextPane();
		RangetextPane.setBackground(Color.LIGHT_GRAY);
		RangetextPane.setForeground(Color.BLACK);
		RangetextPane.setBounds(247, 341, 210, 33);
		add(RangetextPane);
		
		JLabel lblKeyWords = new JLabel("Key Words:");
		lblKeyWords.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblKeyWords.setBounds(112, 385, 102, 33);
		add(lblKeyWords);
		
		KeyWordstextPane = new JTextPane();
		KeyWordstextPane.setForeground(Color.BLACK);
		KeyWordstextPane.setBackground(Color.LIGHT_GRAY);
		KeyWordstextPane.setBounds(247, 385, 210, 33);
		add(KeyWordstextPane);
			
				
		BackButton = new JButton("Back");
		BackButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		BackButton.setBounds(79, 506, 186, 56);
		add(BackButton);
		
		SearchbtnNewButton = new JButton("Search");
		SearchbtnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		SearchbtnNewButton.setBounds(467, 506, 196, 56);
		add(SearchbtnNewButton);

	}
}
