package gui;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianGui extends EditorGui {
	public JButton btnAddBook,btnPayReq,btnSigninRequest,btnAcocuntEditor,btnAddAccount;
	/**
	 * Create the panel.
	 */
	public LibrarianGui(String s) {
		super(s);
		btnAddBook = new JButton("Add Book");
		btnAddBook.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAddBook.setBounds(75, 294, 560, 30);
		add(btnAddBook);
		
		btnPayReq = new JButton("Pay Request");
		btnPayReq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPayReq.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnPayReq.setBounds(75, 424, 560, 30);
		add(btnPayReq);
		
		btnSigninRequest = new JButton("Sign-In Request");
		btnSigninRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSigninRequest.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnSigninRequest.setBounds(75, 336, 560, 30);
		add(btnSigninRequest);
		
		btnAcocuntEditor = new JButton("Account Editor");
		btnAcocuntEditor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAcocuntEditor.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAcocuntEditor.setBounds(75, 379, 560, 30);
		add(btnAcocuntEditor);
		
		btnAddAccount = new JButton("Add Account");
		btnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddAccount.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAddAccount.setBounds(75, 465, 560, 30);
		add(btnAddAccount);

	}

}
