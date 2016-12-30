package gui;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibraryManagerGui extends LibrarianGui{
	public JButton btnGetReport;
	/**
	 * Create the panel.
	 */
	public LibraryManagerGui(String s ) {
		super(s);
		
		btnGetReport = new JButton("Get a Rapport");
		btnGetReport.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnGetReport.setBounds(75, 511, 560, 30);
		add(btnGetReport);

	}
}
