package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibraryManagerGui extends LibrarianGui{

	/**
	 * Create the panel.
	 */
	public LibraryManagerGui(String s ) {
		super(s);
		
		JButton btnNewButton = new JButton("Get a Rapport");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton.setBounds(75, 511, 560, 30);
		add(btnNewButton);

	}
}
