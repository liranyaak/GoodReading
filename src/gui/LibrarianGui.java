package gui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianGui extends EditorGui {

	/**
	 * Create the panel.
	 */
	public LibrarianGui(String s) {
		super(s);
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAddBook.setBounds(75, 294, 560, 30);
		add(btnAddBook);
		
		JButton btnPayReq = new JButton("Pay Request");
		btnPayReq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPayReq.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnPayReq.setBounds(75, 424, 560, 30);
		add(btnPayReq);
		
		JButton btnSgininRequest = new JButton("Sgin-in Request");
		btnSgininRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSgininRequest.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnSgininRequest.setBounds(75, 336, 560, 30);
		add(btnSgininRequest);
		
		JButton btnNewButton = new JButton("Account Editor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton.setBounds(75, 379, 560, 30);
		add(btnNewButton);
		
		JButton btnAddAccount = new JButton("Add Account");
		btnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddAccount.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAddAccount.setBounds(75, 465, 560, 30);
		add(btnAddAccount);

	}

}
